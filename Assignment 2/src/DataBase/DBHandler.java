package DataBase;

import Passengers.*;
import Wagons.*;

import java.sql.*;
import java.util.ArrayList;

public class DBHandler extends Configs {
    String passengersTable = "`passengers`";
    String wagonsTable = "`wagons`";

    public boolean isValid(String login, String password) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM managers WHERE login='" + login + "'AND password='" + password + "';";
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(query);
        return rst.next();
    }
    public Connection getConnection() {
        try {
            final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addPassenger(String firstname, String lastname, int age, boolean isStudent, boolean isDisabled, int idWagon) throws SQLException {
        Connection connection = getConnection();
        String addPassenger = "INSERT INTO " + passengersTable + " (firstname, lastname, age, isStudent, isDisabled, idWagon) VALUES (?, ?, ?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addPassenger);
        preparedStatement.setString(1, firstname);
        preparedStatement.setString(2, lastname);
        preparedStatement.setInt(3, age);
        preparedStatement.setBoolean(4, isStudent);
        preparedStatement.setBoolean(5, isDisabled);
        preparedStatement.setInt(6, idWagon);
        preparedStatement.executeUpdate();
    }

    public void removePassenger(String ticketNumber, int idWagon) throws SQLException {
        Connection connection = getConnection();
        String removeWagon = "DELETE FROM " + passengersTable + " WHERE `passengers`.`idPassenger`=" + (Integer.parseInt(ticketNumber) - idWagon) + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(removeWagon);
        preparedStatement.executeUpdate();
    }

    public void changeFirstName(String ticketNumber, int idWagon, String firstname) throws SQLException {
        Connection connection = getConnection();
        String changeFirstName = "UPDATE " + passengersTable + "SET `firstname`='" + firstname + "' WHERE `passengers`.`idPassenger`=" + (Integer.parseInt(ticketNumber) - idWagon) + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(changeFirstName);
        preparedStatement.executeUpdate();
    }

    public void changeLastName(String ticketNumber, int idWagon, String lastname) throws SQLException {
        Connection connection = getConnection();
        String changeFirstName = "UPDATE " + passengersTable + "SET `lastname`='" + lastname + "' WHERE `passengers`.`idPassenger`=" + (Integer.parseInt(ticketNumber) - idWagon) + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(changeFirstName);
        preparedStatement.executeUpdate();
    }

    public void changeAge(String ticketNumber, int idWagon, int age) throws SQLException {
        Connection connection = getConnection();
        String changeFirstName = "UPDATE " + passengersTable + "SET `age`='" + age + "' WHERE `passengers`.`idPassenger`=" + (Integer.parseInt(ticketNumber) - idWagon) + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(changeFirstName);
        preparedStatement.executeUpdate();
    }

    public void addWagon(Wagon wagon) throws SQLException {
        Connection connection = getConnection();
        String addWagon = "INSERT INTO " + wagonsTable + " (wagonType, maxPass, price) VALUES (?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addWagon);
        preparedStatement.setString(1, wagon.getTypeOfWagon());
        preparedStatement.setInt(2, wagon.getMaxNumberOfPassengers());
        preparedStatement.setInt(3, wagon.getPrice());
        preparedStatement.executeUpdate();
    }

    public void removeWagon(Wagon wagon) throws SQLException {
        Connection connection = getConnection();
        String removeWagon = "DELETE FROM " + wagonsTable + " WHERE `wagons`.`idWagon`=" + wagon.getIdWagon() + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(removeWagon);
        preparedStatement.executeUpdate();
    }

    public void updateTrain(ArrayList<Wagon> train) throws SQLException {
        train.clear();
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        String selectWagons = "SELECT * FROM " + wagonsTable + ";";
        ResultSet resultSet = statement.executeQuery(selectWagons);
        while(resultSet.next()) {
            Wagon wagon;
            switch (resultSet.getString(1)) {
                case "Deluxe" -> {
                    wagon = new Deluxe();
                }
                case "Coupe" -> {
                    wagon = new Coupe();
                }
                case "Reserved Seat" -> {
                    wagon = new ReservedSeat();
                }
                case "Seat" -> {
                    wagon = new Seat();
                }
                default -> throw new IllegalStateException("Unexpected value: " + resultSet.getString(1));
            }
            wagon.setIdWagon(resultSet.getInt(4));
            train.add(wagon);
        }
        String selectPassengers = "SELECT * FROM " + passengersTable + ";";
        resultSet = statement.executeQuery(selectPassengers);
        while(resultSet.next()) {
            Passenger passenger;
            String firstName = resultSet.getString(2);
            String lastName = resultSet.getString(3);
            int age = resultSet.getInt(4);
            String ticket = Integer.toString(resultSet.getInt(7) + resultSet.getInt(1));

            if (resultSet.getBoolean(6)) {
                passenger = new Disabled(firstName, lastName, age, ticket);
            } else if (resultSet.getBoolean(5)) {
                passenger = new Student(firstName, lastName, age, ticket);
            } else if(age >= 60) {
                passenger = new Elderly(firstName, lastName, age, ticket);
            } else if(age < 16) {
                passenger = new Child(firstName, lastName, age, ticket);
            } else {
                passenger = new Adult(firstName, lastName, age, ticket);
            }
            for (Wagon wagon : train) {
                if (resultSet.getInt(7) == wagon.getIdWagon()) {
                    wagon.getPassengers().add(passenger);
                    break;
                }
            }
        }
    }



}

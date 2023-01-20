package DataBase;

import Passengers.*;
import Wagons.*;

import java.sql.*;
import java.util.ArrayList;

public class DBHandler extends Configs {
    protected final String passengersTable = "`passengers`";
    protected final String wagonsTable = "`wagons`";

    public Connection getConnection() {
        try {
            final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isValidManager(String login, String password) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM managers WHERE login='" + login + "'AND password='" + password + "';";
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(query);
        return rst.next();
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

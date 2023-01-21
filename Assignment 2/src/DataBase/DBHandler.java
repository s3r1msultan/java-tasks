package DataBase;

import Passengers.*;
import Wagons.*;

import java.sql.*;
import java.util.ArrayList;

public class DBHandler extends Configs {
    protected final String passengersTable = "`passengers`";
    protected final String wagonsTable = "`wagons`";
    protected final String managersTable = "`managers`";


    // Returns connection object that can interact with database
    public Connection getConnection() {
        try {
            final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    // Login and password verification
    public boolean isValidManager(String login, String password) throws SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM " + managersTable + " WHERE login='" + login + "'AND password='" + password + "';"; // query to get row with certain login and password
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(query);     // it stores result of execution the query
        return rst.next();    // this one tells us if we have such a manager
    }

    public void updateTrain(ArrayList<Wagon> train) throws SQLException {
        train.clear();
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        String selectWagons = "SELECT * FROM " + wagonsTable + ";";     // here we get all wagons from database
        ResultSet resultSet = statement.executeQuery(selectWagons);       // result of execution
        while(resultSet.next()) {               // next method tells us if we have a wagon and moves on to the next row in wagons table of our database
            Wagon wagon;
            switch (resultSet.getString(1)) {       // here we get the first column of the table that stores wagon type
                case "Deluxe" -> {                             // and then we create that object with this type
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
                default -> throw new IllegalStateException("Unexpected value: " + resultSet.getString(1));  // otherwise we throw an error
            }
            wagon.setIdWagon(resultSet.getInt(4)); // then we set an id of wagon from database
            train.add(wagon);
        }



        String selectPassengers = "SELECT * FROM " + passengersTable + ";"; // here we get all passengers from database
        resultSet = statement.executeQuery(selectPassengers);
        while(resultSet.next()) {

            Passenger passenger;
            String firstName = resultSet.getString(2);         // we store info about current passenger
            String lastName = resultSet.getString(3);
            int age = resultSet.getInt(4);
            String ticket = Integer.toString(resultSet.getInt(7) + resultSet.getInt(1));  // we create the ticket by summing the id of passenger and its id of wagon


            // we create an object of passenger based on its data
            if (resultSet.getBoolean(6)) {    // if it is disabled
                passenger = new Disabled(firstName, lastName, age, ticket);
            } else if (resultSet.getBoolean(5)) { // if it is student
                passenger = new Student(firstName, lastName, age, ticket);
            } else if(age >= 60) {                          // if it is older than 60
                passenger = new Elderly(firstName, lastName, age, ticket);
            } else if(age < 16) {                           // if it is younger than 16
                passenger = new Child(firstName, lastName, age, ticket);
            } else {                                        // in otherwise cases
                passenger = new Adult(firstName, lastName, age, ticket);
            }

            // passenger cannot exist without id of wagon
            for (Wagon wagon : train) {
                if (resultSet.getInt(7) == wagon.getIdWagon()) {
                    wagon.getPassengers().add(passenger);
                    break;
                }
            }
        }
        connection.close();
    }



}

package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PassengersHandler extends DBHandler{

    // by prepared statement we interact with database
    // we can change the database info
    // set+typeOfVariable we use to add such value to table

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
        connection.close();
    }

    public void removePassenger(String ticketNumber, int idWagon) throws SQLException {
        Connection connection = getConnection();
        String removeWagon = "DELETE FROM " + passengersTable + " WHERE "+ passengersTable +".`idPassenger`=" + (Integer.parseInt(ticketNumber) - idWagon) + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(removeWagon);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public void changeFirstName(String ticketNumber, int idWagon, String firstname) throws SQLException {
        Connection connection = getConnection();
        String changeFirstName = "UPDATE " + passengersTable + "SET `firstname`='" + firstname + "' WHERE "+ passengersTable +".`idPassenger`=" + (Integer.parseInt(ticketNumber) - idWagon) + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(changeFirstName);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public void changeLastName(String ticketNumber, int idWagon, String lastname) throws SQLException {
        Connection connection = getConnection();
        String changeFirstName = "UPDATE " + passengersTable + "SET `lastname`='" + lastname + "' WHERE "+ passengersTable +".`idPassenger`=" + (Integer.parseInt(ticketNumber) - idWagon) + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(changeFirstName);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public void changeAge(String ticketNumber, int idWagon, int age) throws SQLException {
        Connection connection = getConnection();
        String changeFirstName = "UPDATE " + passengersTable + "SET `age`='" + age + "' WHERE "+ passengersTable +".`idPassenger`=" + (Integer.parseInt(ticketNumber) - idWagon) + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(changeFirstName);
        preparedStatement.executeUpdate();
        connection.close();
    }
}

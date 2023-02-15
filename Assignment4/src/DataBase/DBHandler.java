package DataBase;

import Cars.Car;
import java.sql.*;
import java.util.ArrayList;

public class DBHandler extends Configs {
    protected final String managersTable = "`managers`";
    protected final String carsTable = "`cars`";

    // Returns connection object that can interact with database
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
        String query = "SELECT * FROM " + managersTable + " WHERE login='" + login + "'AND password='" + password + "';"; // query to get row with certain login and password
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(query);     // it stores result of execution the query

        return rst.next();    // this one tells us if we have such a manager
    }
}

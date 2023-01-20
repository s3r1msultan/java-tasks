package DataBase;

import Wagons.Wagon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WagonsHandler extends DBHandler{
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
}

import DataBase.DBHandler;

import java.sql.SQLException;

public class DBTest{
    public static void main(String[] args) {
        DBHandler dbHandler = new DBHandler();
        try {
//            dbHandler.addPassenger("Bobby", "Jones", 34);
//            dbHandler.showPassengers();
            System.out.println(dbHandler.isValid("toor", "toor"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

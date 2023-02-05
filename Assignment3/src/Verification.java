import DataBase.DBHandler;

import java.sql.SQLException;
import java.util.Scanner;

public class Verification {
    public boolean isValidManager(DBHandler dbHandler) throws SQLException {
        Scanner cin = new Scanner(System.in);
        System.out.println("####################################");
        System.out.println("Enter login and password: ");
        System.out.print("Login: ");
        String login = cin.next().trim();
        System.out.print("Password: ");
        String password = cin.next().trim();
        if (dbHandler.isValidManager(login, password)) {
            System.out.println();
            System.out.println("You have successfully logged in");
            System.out.println("####################################");
            return true;
        } else {
            System.out.println();
            System.out.println("You have entered wrong login or password");
            System.out.println("####################################");
            return false;
        }
    }
}

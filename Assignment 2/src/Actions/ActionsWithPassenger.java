package Actions;

import DataBase.DBHandler;
import Wagons.Wagon;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ActionsWithPassenger {
    ArrayList<Wagon> train;
    int wagonNumber;
    Scanner cin;
    DBHandler dbHandler;
    public ActionsWithPassenger(ArrayList<Wagon> train, Scanner cin, DBHandler dbHandler, int wagonNumber) {
        this.cin = cin;
        this.train = train;
        this.dbHandler = dbHandler;
        this.wagonNumber = wagonNumber;
    }
    public void adding() throws SQLException {
        System.out.print("First name: ");
        String firstname = cin.next().trim();
        System.out.print("Last name: ");
        String lastName = cin.next().trim();
        System.out.print("Age: ");
        int age = cin.nextInt();
        System.out.println("Do you have a student card?(Yes or No)");
        boolean isStudent = cin.next().trim().toLowerCase().equals("yes");
        System.out.println("Do you have a disability?(Yes or No)");
        boolean isDisabled = cin.next().trim().toLowerCase().equals("yes");
        int idWagon = train.get(wagonNumber).getIdWagon();
        dbHandler.addPassenger(firstname, lastName, age, isStudent, isDisabled, idWagon);
        dbHandler.updateTrain(train);
        System.out.println("You have successfully added the passenger!!!");
    }
    public void removing() throws SQLException {
        System.out.println("Enter ticket number: ");
        String ticketNumber = cin.next().trim();
        dbHandler.removePassenger(ticketNumber, train.get(wagonNumber).getIdWagon());
        dbHandler.updateTrain(train);
        System.out.println("You have successfully removed the passenger");
    }

    public void changingFirstName(String ticketNumber) throws SQLException {
        System.out.println("Enter your first name you want: ");
        String firstName = cin.next().trim();
        dbHandler.changeFirstName(ticketNumber, train.get(wagonNumber).getIdWagon(), firstName);
        dbHandler.updateTrain(train);
        System.out.println("You have successfully changed the first name of the passenger");
    }

    public void changingLastName(String ticketNumber) throws SQLException {
        System.out.println("Enter your last name you want: ");
        String lastName = cin.next().trim();
        dbHandler.changeLastName(ticketNumber, train.get(wagonNumber).getIdWagon(), lastName);
        dbHandler.updateTrain(train);
        System.out.println("You have successfully changed the last name of the passenger");
    }

    public void changingAge(String ticketNumber) throws SQLException {
        System.out.println("Enter your age you want: ");
        int age = cin.nextInt();
        dbHandler.changeAge(ticketNumber, train.get(wagonNumber).getIdWagon(), age);
        dbHandler.updateTrain(train);
        System.out.println("You have successfully changed the age of the passenger");
    }
}

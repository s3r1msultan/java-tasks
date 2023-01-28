package Actions;

import DataBase.PassengersHandler;
import Wagons.Wagon;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ActionsWithPassenger {
    ArrayList<Wagon> train;
    int wagonNumber;
    Scanner cin;
    PassengersHandler passengersHandler;
    public ActionsWithPassenger(ArrayList<Wagon> train, Scanner cin, PassengersHandler passengersHandler, int wagonNumber) { //  pass these objects as parameters
        this.cin = cin;
        this.train = train;
        this.passengersHandler = passengersHandler;
        this.wagonNumber = wagonNumber;
    }
    public void adding() throws SQLException {
        System.out.print("First name: ");
        String firstname = cin.next().trim(); // trim method deletes all whitespaces in string
        System.out.print("Last name: ");
        String lastName = cin.next().trim();
        System.out.print("Age: ");
        int age = cin.nextInt();
        System.out.println("Do you have a student card?(Yes or No)");
        boolean isStudent = cin.next().trim().toLowerCase().equals("yes");  // first of all we delete all whitespaces and then transform this word to lowercase and compare it with "yes" word
        System.out.println("Do you have a disability?(Yes or No)");
        boolean isDisabled = cin.next().trim().toLowerCase().equals("yes"); // the same comparison
        int idWagon = train.get(wagonNumber).getIdWagon();
        passengersHandler.addPassenger(firstname, lastName, age, isStudent, isDisabled, idWagon);  // here we call addPassenger method of passengerHandler
        passengersHandler.updateTrain(train); // We update train
        System.out.println("You have successfully added the passenger!!!");
    }
    public void removing() throws SQLException {
        System.out.println("Enter ticket number: ");
        String ticketNumber = cin.next().trim();
        passengersHandler.removePassenger(ticketNumber, train.get(wagonNumber).getIdWagon()); // here we call removePassenger method of passengerHandler and pass ticketNumber
        passengersHandler.updateTrain(train);
        System.out.println("You have successfully removed the passenger");
    }

    public void changingFirstName(String ticketNumber) throws SQLException {
        System.out.println("Enter your first name you want: ");
        String firstName = cin.next().trim();
        passengersHandler.changeFirstName(ticketNumber, train.get(wagonNumber).getIdWagon(), firstName); // we pass first name
        passengersHandler.updateTrain(train);
        System.out.println("You have successfully changed the first name of the passenger");
    }

    public void changingLastName(String ticketNumber) throws SQLException {
        System.out.println("Enter your last name you want: ");
        String lastName = cin.next().trim();
        passengersHandler.changeLastName(ticketNumber, train.get(wagonNumber).getIdWagon(), lastName); // we pass last name
        passengersHandler.updateTrain(train);
        System.out.println("You have successfully changed the last name of the passenger");
    }

    public void changingAge(String ticketNumber) throws SQLException {
        System.out.println("Enter your age you want: ");
        int age = cin.nextInt();
        passengersHandler.changeAge(ticketNumber, train.get(wagonNumber).getIdWagon(), age); // we pass age
        passengersHandler.updateTrain(train);
        System.out.println("You have successfully changed the age of the passenger");
    }
}

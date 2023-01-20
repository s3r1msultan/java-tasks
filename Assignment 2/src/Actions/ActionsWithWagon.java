package Actions;

import DataBase.DBHandler;
import Wagons.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ActionsWithWagon {
    ArrayList<Wagon> train;
    Scanner cin;
    DBHandler dbHandler;
    public ActionsWithWagon(ArrayList<Wagon> train, Scanner cin, DBHandler dbHandler) {
        this.cin = cin;
        this.train = train;
        this.dbHandler = dbHandler;
    }

    public void adding() throws SQLException {
        System.out.println("What wagon do you want to add?");
        System.out.println("1.Deluxe \n2.Coupe \n3.Reserved seat \n4.Seat ");
        System.out.print("Choose one of them: ");
        int wagonName = cin.nextInt();
        switch (wagonName) {
            case 1 -> dbHandler.addWagon(new Deluxe());
            case 2 -> dbHandler.addWagon(new Coupe());
            case 3 -> dbHandler.addWagon(new ReservedSeat());
            case 4 -> dbHandler.addWagon(new Seat());
            default -> System.out.println("Sorry, we don't have the type of wagon like yours");
        }
        dbHandler.updateTrain(train);
        System.out.println("You have successfully added the wagon");
    }


    public void removing() throws SQLException {
        System.out.println("Which wagon do you want to remove?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        System.out.print("Enter wagon number: ");
        int wagonNumber = cin.nextInt()-1;
        if(wagonNumber < train.size() && wagonNumber >= 0) {
            dbHandler.removeWagon(train.get(wagonNumber));
            dbHandler.updateTrain(train);
            System.out.println("You have successfully removed the wagon");
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }
    }

    public void info() {
        System.out.println("Which wagon's info do you want to get?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        System.out.print("Enter wagon number: ");
        int wagonNumber = cin.nextInt()-1;
        if(wagonNumber < train.size() && wagonNumber >= 0) {
            System.out.println(train.get(wagonNumber).getInfo(true));
            for (int i = 0; i < train.get(wagonNumber).getPassengers().size(); ++i) {
                System.out.println(i+1);
                System.out.println(train.get(wagonNumber).getPassengers().get(i).getInfo());
            }
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }
    }
}

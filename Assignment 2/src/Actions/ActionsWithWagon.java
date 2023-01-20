package Actions;

import DataBase.DBHandler;
import Wagons.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ActionsWithWagon {

    public void adding(ArrayList<Wagon> train, Scanner cin, DBHandler dbHandler) throws SQLException {
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
    }


    public void removing(ArrayList<Wagon> train, Scanner cin, DBHandler dbHandler) throws SQLException {
        System.out.println("Which wagon do you want to remove?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt()-1;
        if(wagonNumber < train.size() && wagonNumber >= 0) {
            dbHandler.removeWagon(train.get(wagonNumber));
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }

    }

    public void info(ArrayList<Wagon> train, Scanner cin) {
        System.out.println("Which wagon's info do you want to get?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt();
        if(wagonNumber <= train.size() && wagonNumber > 0) {
            System.out.println(train.get(wagonNumber-1).getInfo());
            for (int i = 0; i < train.get(wagonNumber-1).getPassengers().size(); ++i) {
                System.out.println(i+1);
                System.out.println(train.get(wagonNumber-1).getPassengers().get(i).getInfo());
            }
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }
    }
}

package Wagons;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionsWithWagon {

    public void adding(ArrayList<Wagon> train, Scanner cin) {
        System.out.println("What wagon do you want to add?");
        System.out.println("1.Deluxe \n2.Coupe \n3.Reserved seat \n4.Seat ");
        System.out.print("Choose one of them: ");
        int wagonName = cin.nextInt();
        System.out.println("Where do you want to add?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt();
        if(wagonNumber <= train.size()+1 && wagonNumber > 0) {
            switch (wagonName) {
                case 1 -> train.add(wagonNumber - 1, new Deluxe());
                case 2 -> train.add(wagonNumber - 1, new Coupe());
                case 3 -> train.add(wagonNumber - 1, new ReservedSeat());
                case 4 -> train.add(wagonNumber - 1, new Seat());
                default -> System.out.println("Sorry, we don't have the type of wagon like yours");
            }
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + (train.size()+1));
        }
    }


    public void removing(ArrayList<Wagon> train, Scanner cin) {
        System.out.println("Which wagon do you want to remove?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt();
        if(wagonNumber <= train.size() && wagonNumber > 0) {
            train.remove(wagonNumber-1);
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

package Actions;

import Passengers.*;
import Wagons.Wagon;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionsWithPassenger {
    public void adding(ArrayList<Wagon> train, Scanner cin) {
        System.out.println("Where do you want to add the passenger?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt();
        if(wagonNumber > 0 && wagonNumber <= train.size()) {
            System.out.print("Firstname: ");
            String firstName = cin.next().trim();
            System.out.print("Lastname: ");
            String lastName = cin.next().trim();
            System.out.print("Age: ");
            int age = cin.nextInt();
            System.out.println("Do you have a student card?(Yes or No)");
            boolean isStudent = cin.next().trim().toLowerCase().equals("yes");
            System.out.println("Do you have a disability?(Yes or No)");
            boolean isInvalid = cin.next().trim().toLowerCase().equals("yes");
            String ticket = wagonNumber + "" + train.get(wagonNumber-1).getPassengers().size();
            if (isInvalid) {
                Disabled disabled = new Disabled(firstName, lastName, age, ticket);
                train.get(wagonNumber-1).getPassengers().add(disabled);
            } else if (isStudent) {
                Student student = new Student(firstName, lastName, age, ticket);
                train.get(wagonNumber-1).getPassengers().add(student);
            } else if(age >= 60) {
                Elderly elderly = new Elderly(firstName, lastName, age, ticket);
                train.get(wagonNumber-1).getPassengers().add(elderly);
            } else if(age < 16) {
                Child child = new Child(firstName, lastName, age, ticket);
                train.get(wagonNumber-1).getPassengers().add(child);
            } else {
                Adult adult = new Adult(firstName, lastName, age, ticket);
                train.get(wagonNumber-1).getPassengers().add(adult);
            }

            System.out.println("You have successfully added the passenger!!!");
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }
    }
    public void removing(ArrayList<Wagon> train, Scanner cin) {
        System.out.println("Where do you want to remove the passenger?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt();
        if(wagonNumber > 0 && wagonNumber <= train.size()) {
            System.out.println("In which seat does the passenger sit?");
            int seatNumber = cin.nextInt();
            if (seatNumber <= train.get(wagonNumber-1).getPassengers().size() && seatNumber > 0) {
                train.get(wagonNumber-1).getPassengers().remove(seatNumber-1);
            } else {
                System.out.println("The number is out of range");
                System.out.println("Please enter a number between 1 and " + train.get(wagonNumber-1).getPassengers().size());
            }
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }
    }

    public void changingFirstName(ArrayList<Wagon> train, Scanner cin) {
        System.out.println("In which wagon is the passenger?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt();
        if(wagonNumber > 0 && wagonNumber <= train.size()) {
            System.out.print("Your current firstname in ticket: ");
            String firstName = cin.next().trim();
            for (int i = 0; i < train.get(wagonNumber-1).getPassengers().size(); ++i) {
                if (train.get(wagonNumber-1).getPassengers().get(i).getFirstName().equals(firstName)) {
                    System.out.print("Firstname to be changed to: ");
                    firstName = cin.next().trim();
                    train.get(wagonNumber-1).getPassengers().get(i).setFirstName(firstName);
                    break;
                }
            }
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }
    }

    public void changingLastName(ArrayList<Wagon> train, Scanner cin) {
        System.out.println("In which wagon is the passenger?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt();
        if(wagonNumber > 0 && wagonNumber <= train.size()) {
            System.out.print("Your current lastname in ticket: ");
            String lastname = cin.next().trim();
            for (int i = 0; i < train.get(wagonNumber-1).getPassengers().size(); ++i) {
                if (train.get(wagonNumber-1).getPassengers().get(i).getLastName().equals(lastname)) {
                    System.out.print("Lastname to be changed to: ");
                    lastname = cin.next().trim();
                    train.get(wagonNumber-1).getPassengers().get(i).setLastName(lastname);
                    break;
                }
            }
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }
    }

    public void changingAge(ArrayList<Wagon> train, Scanner cin) {
        System.out.println("In which wagon is the passenger?");
        System.out.println("Max amount of wagons in the train is " + train.size());
        int wagonNumber = cin.nextInt();
        if(wagonNumber > 0 && wagonNumber <= train.size()) {
            System.out.print("Your current firstname in ticket: ");
            int age = cin.nextInt();
            for (int i = 0; i < train.get(wagonNumber-1).getPassengers().size(); ++i) {
                if (train.get(wagonNumber-1).getPassengers().get(i).getAge() == age) {
                    System.out.print("Firstname to be changed to: ");
                    age = cin.nextInt();
                    train.get(wagonNumber-1).getPassengers().get(i).setAge(age);
                    break;
                }
            }
        } else {
            System.out.println("The number is out of range");
            System.out.println("Please enter a number between 1 and " + train.size());
        }
    }
}

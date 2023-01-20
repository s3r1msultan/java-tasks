import Actions.ActionsWithPassenger;
import Actions.ActionsWithWagon;
import Actions.Commands;
import Actions.Verification;
import DataBase.DBHandler;
import DataBase.PassengersHandler;
import DataBase.WagonsHandler;
import Passengers.Passenger;
import Wagons.Wagon;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {


        Commands menu = new Commands();
        Scanner cin = new Scanner(System.in);
        ArrayList<Wagon> train = new ArrayList<>();
        DBHandler dbHandler = new DBHandler();
        dbHandler.updateTrain(train);


        int menuNum;
        while(true) {
            menu.initialCommands();
            menuNum = cin.nextInt();
            if (menuNum == 0) {
                System.out.println("You left the menu");
                break;
            } else if (menuNum == 1) {
                boolean answer = new Verification().isValidManager(dbHandler);
                WagonsHandler wagonsHandler = new WagonsHandler();
                ActionsWithWagon actionsWithWagon = new ActionsWithWagon(train, cin, wagonsHandler);
                while(answer) {
                    menu.managerCommands();
                    menuNum = cin.nextInt();
                    if (menuNum == 0) {
                        break;

                    } else if(menuNum == 1) {

                        System.out.println("####################################");
                        System.out.println("Please, enter the number of the wagon you want to work with");
                        System.out.println("Max amount of wagons in the train is " + train.size());
                        System.out.print("Enter wagon number: ");
                        int wagonNumber = cin.nextInt()-1;
                        System.out.println("####################################");
                        if(!(wagonNumber >= 0 && wagonNumber < train.size())) {
                            System.out.println("The number is out of range");
                            System.out.println("Please, enter a number between 1 and " + train.size());
                            System.out.println("####################################");
                            continue;
                        }

                        while(true) {
                            PassengersHandler passengersHandler = new PassengersHandler();
                            ActionsWithPassenger actionsWithPassenger = new ActionsWithPassenger(train, cin, passengersHandler, wagonNumber);
                            menu.wagonEditingCommands();
                            menuNum = cin.nextInt();
                            if(menuNum == 0) {
                                break;
                            } else if (menuNum == 1) {
                                actionsWithPassenger.adding();
                            } else if (menuNum == 2) {
                                actionsWithPassenger.removing();
                            } else if (menuNum == 3) {
                                System.out.print("Enter ticket number: ");
                                String ticketNumber = cin.next().trim();
                                for (Passenger passenger: train.get(wagonNumber).getPassengers()) {
                                    if (passenger.getTicketNumber().equals(ticketNumber)) {
                                        while(true) {
                                            menu.passengerInfoEditingCommands();
                                            menuNum = cin.nextInt();
                                            if (menuNum == 0) {
                                                break;
                                            } else if (menuNum == 1) {
                                                actionsWithPassenger.changingFirstName(ticketNumber);
                                            } else if (menuNum == 2) {
                                                actionsWithPassenger.changingLastName(ticketNumber);
                                            } else if (menuNum == 3) {
                                                actionsWithPassenger.changingAge(ticketNumber);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }


                    // Adding a wagon
                    } else if(menuNum == 2) {
                        actionsWithWagon.adding();

                    // Removing a wagon
                    } else if(menuNum == 3) {
                        actionsWithWagon.removing();

                    // Info about a wagon
                    } else if(menuNum == 4) {
                        actionsWithWagon.info();
                    }
                }
            } else if (menuNum == 2) {
                while(true) {
                    menu.customerCommands();
                    menuNum = cin.nextInt();
                    if (menuNum == 0) {
                        break;
                    } else if (menuNum == 1) {
                        System.out.println("In which wagon is your seat?");
                        System.out.println("Max amount of wagons in the train is " + train.size());
                        int wagonNumber = cin.nextInt() - 1;
                        if(wagonNumber >= 0 && wagonNumber < train.size()) {
                            System.out.print("Your ticket number: ");
                            String  ticketNum = cin.next().trim();
                            for (Passenger passenger: train.get(wagonNumber).getPassengers()) {
                                if (ticketNum.equals(passenger.getTicketNumber())) {
                                    System.out.println(train.get(wagonNumber).getInfo(false));
                                    System.out.println(passenger.getInfo());
                                    System.out.println("Ticket price: " + passenger.ticketPrice(train.get(wagonNumber).getPrice()));
                                    break;
                                }
                            }
                        } else {
                            System.out.println("The number is out of range");
                            System.out.println("Please enter a number between 1 and " + train.size());
                        }
                    }
                }
            }
        }
    }
}
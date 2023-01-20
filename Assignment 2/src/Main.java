import Actions.ActionsWithPassenger;
import Actions.ActionsWithWagon;
import Actions.Commands;
import Actions.Verification;
import DataBase.DBHandler;
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
                ActionsWithWagon actionsWithWagon = new ActionsWithWagon();
                while(answer) {
                    menu.managerCommands();
                    menuNum = cin.nextInt();
                    if (menuNum == 0) {
                        break;



                    } else if(menuNum == 1) {
                        while(true) {
                            ActionsWithPassenger actionsWithPassenger = new ActionsWithPassenger();
                            menu.wagonEditingCommands();
                            menuNum = cin.nextInt();
                            if(menuNum == 0) {
                                break;
                            } else if (menuNum == 1) {
                                actionsWithPassenger.adding(train, cin);
                            } else if (menuNum == 2) {
                                actionsWithPassenger.removing(train, cin);
                            } else if (menuNum == 3) {
                                while(true) {
                                    menu.passengerInfoEditingCommands();
                                    menuNum = cin.nextInt();
                                    if (menuNum == 0) {
                                        break;
                                    } else if (menuNum == 1) {
                                        actionsWithPassenger.changingFirstName(train, cin);
                                    } else if (menuNum == 2) {
                                        actionsWithPassenger.changingLastName(train, cin);
                                    } else if (menuNum == 3) {
                                        actionsWithPassenger.changingAge(train, cin);
                                    }
                                }
                            }
                        }


                    // Adding a wagon
                    } else if(menuNum == 2) {
                        actionsWithWagon.adding(train, cin, dbHandler);

                    // Removing a wagon
                    } else if(menuNum == 3) {
                        actionsWithWagon.removing(train, cin, dbHandler);

                    // Info about a wagon
                    } else if(menuNum == 4) {
                        actionsWithWagon.info(train, cin);
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
                        int wagonNumber = cin.nextInt();
                        if(wagonNumber > 0 && wagonNumber <= train.size()) {
                            System.out.print("Your ticket number in ticket: ");
                            String ticketNum = cin.next().trim();
                            for (int i = 0; i < train.get(wagonNumber-1).getPassengers().size(); ++i) {
                                if (train.get(wagonNumber-1).getPassengers().get(i).getTicketNumber().equals(ticketNum)) {
                                    train.get(wagonNumber-1).getInfo();
                                    train.get(wagonNumber-1).getPassengers().get(i).getInfo();
                                    break;
                                }
                            }
                        } else {
                            System.out.println("The number is out of range");
                            System.out.println("Please enter a number between 1 and " + train.size());
                        }

                    } else if (menuNum == 2) {
                        System.out.println("In which wagon is your seat?");
                        int wagonNumber = cin.nextInt();
                        if(wagonNumber > 0 && wagonNumber <= train.size()) {
                            System.out.print("Your ticket number: ");
                            String ticketNum = cin.next().trim();
                            for (int i = 0; i < train.get(wagonNumber-1).getPassengers().size(); ++i) {
                                if (train.get(wagonNumber-1).getPassengers().get(i).getTicketNumber().equals(ticketNum)) {
                                    train.get(wagonNumber-1).getPassengers().remove(i);
                                    break;
                                }
                            }
                            System.out.println("We don't have such a ticket");
                        } else {
                            System.out.println("The number is out of range");
                        }
                    }
                }
            }
        }

    }
}
import Passengers.ActionsWithPassenger;
import Wagons.ActionsWithWagon;
import Wagons.Coupe;
import Wagons.ReservedSeat;
import Wagons.Wagon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Commands menu = new Commands();
        Scanner cin = new Scanner(System.in);
        ArrayList<Wagon> train = new ArrayList<>();
        for (int i = 0; i < 8; ++i) {
            train.add(new Coupe());
        }
        for (int i = 0; i < 8; ++i) {
            train.add(new ReservedSeat());
        }


        int menuNum;
        while(true) {
            menu.initialCommands();
            menuNum = cin.nextInt();
            if (menuNum == 0) {
                System.out.println("You left the menu");
                break;
            } else if (menuNum == 1) {
                Verification verification = new Verification();
                boolean answer = verification.isValidManager();
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
                        actionsWithWagon.adding(train, cin);

                    // Removing a wagon
                    } else if(menuNum == 3) {
                        actionsWithWagon.removing(train, cin);

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
                        System.out.println("Max amount of wagons in the train is " + train.size());
                        int wagonNumber = cin.nextInt();
                        if(wagonNumber > 0 && wagonNumber <= train.size()) {
                            System.out.print("Your ticket number in ticket: ");
                            String ticketNum = cin.next().trim();
                            for (int i = 0; i < train.get(wagonNumber-1).getPassengers().size(); ++i) {
                                if (train.get(wagonNumber-1).getPassengers().get(i).getTicketNumber().equals(ticketNum)) {
                                    train.get(wagonNumber-1).getPassengers().remove(i);
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
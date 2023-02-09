import Actions.ActionsWithCar;
import Actions.Commands;
import Actions.Verification;
import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;
import DataBase.CarsHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Commands menu = new Commands();
        Scanner cin = new Scanner(System.in);
        ArrayList<PassengerCarBody> passengerCars = new ArrayList<>();
        ArrayList<CommercialCarBody> commercialCars = new ArrayList<>();

        CarsHandler carsHandler = new CarsHandler();

        carsHandler.updatePassengerCars(passengerCars);
        carsHandler.updateCommercialCars(commercialCars);
        int menuNum;
        while(true) {
            menu.initialCommands();
            menuNum = cin.nextInt();
            if(menuNum==0) {
                System.out.println("You left the menu");
                break;
            } else if (menuNum == 1) {
                boolean answer = new Verification().isValidManager(carsHandler);
                ActionsWithCar actionsWithCar = new ActionsWithCar(passengerCars, commercialCars, carsHandler);
                while (answer) {
                    menu.managerCommands();
                    menuNum = cin.nextInt();
                    if (menuNum == 0) {
                        break;
                    } else if(menuNum == 1) {
                        // adding a car
                        actionsWithCar.add();
                    } else if(menuNum == 2) {
                        // removing a car
                        actionsWithCar.remove();
                    } else if(menuNum == 3) {
                        // getting info about all cars
                        actionsWithCar.getAllCars();
                    }
                }
            } else if (menuNum == 2) {
                while(true) {
                    menu.customerCommands();
                    menuNum = cin.nextInt();
                    if (menuNum == 0) {
                        break;
                    } else if(menuNum == 1) {
                        ActionsWithCar actionsWithCar = new ActionsWithCar(passengerCars, commercialCars, carsHandler);

                        while(true) {
                            menu.choosingCriteria();
                            menuNum = cin.nextInt();
                            if(menuNum == 0) {
                                break;
                            } else if(menuNum == 1) {
                                while(true) {
                                    menu.choosingTypeOfCar();
                                    menuNum = cin.nextInt();
                                    if(menuNum == 0) {
                                        break;
                                    } else if (menuNum == 1) {
                                        actionsWithCar.getByType("Passenger");
                                    } else if (menuNum == 2) {
                                        actionsWithCar.getByType("Commercial");
                                    }
                                }
                            } else if(menuNum == 2) {
                                while(true) {
                                    menu.choosingBodyOfCar();
                                    menuNum = cin.nextInt();
                                    if (menuNum == 0) {
                                        break;
                                    } else if (menuNum == 1) {
                                        actionsWithCar.getByBody("Crossover");
                                    } else if (menuNum == 2) {
                                        actionsWithCar.getByBody("MiniVan");
                                    } else if (menuNum == 3) {
                                        actionsWithCar.getByBody("Sedan");
                                    } else if (menuNum == 4) {
                                        actionsWithCar.getByBody("SUV");
                                    } else if (menuNum == 5) {
                                        actionsWithCar.getByBody("Bus");
                                    } else if (menuNum == 6) {
                                        actionsWithCar.getByBody("Van");
                                    } else if (menuNum == 7) {
                                        actionsWithCar.getByBody("Refrigerator");
                                    } else if (menuNum == 8) {
                                        actionsWithCar.getByBody("Truck");
                                    }
                                }
                            } else if(menuNum == 3) {
                                while(true) {
                                    menu.choosingBrandOfCar();
                                    menuNum = cin.nextInt();
                                    if (menuNum == 0) {
                                        break;
                                    } else if(menuNum == 1) {
                                        actionsWithCar.getByBrand("BMW");
                                    } else if(menuNum == 2) {
                                        actionsWithCar.getByBrand("Hyundai");
                                    } else if(menuNum == 3) {
                                        actionsWithCar.getByBrand("Mercedes");
                                    } else if(menuNum == 4) {
                                        actionsWithCar.getByBrand("Volvo");
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }

    }
}
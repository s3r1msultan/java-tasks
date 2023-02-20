package Actions;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;
import DataBase.CarsHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    Commands menu;
    Scanner cin;
    ArrayList<PassengerCarBody> passengerCars;
    ArrayList<CommercialCarBody> commercialCars;
    public Console() {
        menu = new Commands();
        cin = new Scanner(System.in);
        passengerCars = new ArrayList<>();
        commercialCars = new ArrayList<>();
    }


    public void run() throws SQLException {
        CarsHandler carsHandler = new CarsHandler();
        carsHandler.updatePassengerCars(passengerCars);
        carsHandler.updateCommercialCars(commercialCars);
        int menuNum;
        while(true) {
            menu.initialCommands();
            menuNum = cin.nextInt();

            // Exit
            if(menuNum==0) {
                System.out.println("You left the menu");
                break;


            // Manager menu
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
                    } else if(menuNum == 4) {
                        choosingCriteriaConsole(carsHandler);
                    } else if(menuNum == 5) {
                        editingParametersConsole(carsHandler);
                    }
                }


            // Customer menu
            } else if (menuNum == 2) {
                while(true) {
                    menu.customerCommands();
                    menuNum = cin.nextInt();
                    if (menuNum == 0) {
                        break;
                    } else if(menuNum == 1) {
                        choosingCriteriaConsole(carsHandler);
                    }
                }
            }
        }
    }

    private void editingParametersConsole(CarsHandler carsHandler) throws SQLException {
        ActionsWithCar actionsWithCar = new ActionsWithCar(passengerCars, commercialCars, carsHandler);
        int menuNum;
        String parameter = null;
        while(true) {
            menu.listOfParametersCommands();
            menuNum = cin.nextInt();
            if (menuNum == 0) {
                break;
            } else if(menuNum==1) {
                parameter = "model";
            } else if(menuNum==2) {
                parameter = "engineCapacity";
            }else if(menuNum==3) {
                parameter = "mileage";
            }else if(menuNum==4) {
                parameter = "numOfSeats";
            }else if(menuNum==5) {
                parameter = "fuel";
            }else if(menuNum==6) {
                parameter = "color";
            }else if(menuNum==7) {
                parameter = "year";
            }else if(menuNum==8) {
                parameter = "transmission";
            }else if(menuNum==9) {
                parameter = "price";
            }else if(menuNum==10) {
                parameter = "amount";
            }
            actionsWithCar.editInfo(parameter);
        }
    }


    private void choosingCriteriaConsole(CarsHandler carsHandler) throws SQLException {
        ActionsWithCar actionsWithCar = new ActionsWithCar(passengerCars, commercialCars, carsHandler);
        int menuNum;
        while(true) {
            menu.choosingCriteriaCommands();
            menuNum = cin.nextInt();
            if(menuNum == 0) {
                break;
            } else if(menuNum == 1) {
                while(true) {
                    menu.choosingTypeOfCarCommands();
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
                    menu.choosingBodyOfCarCommands();
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
                    menu.choosingBrandOfCarCommands();
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

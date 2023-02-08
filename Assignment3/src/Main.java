import Actions.ActionsWithCar;
import Actions.Commands;
import Actions.Verification;
import Cars.Car;
import Cars.CommercialCar;
import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercCrossover;
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
                        break;
                    }
                }
            }
        }

    }
}
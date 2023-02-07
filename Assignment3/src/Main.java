import Actions.ActionsWithCar;
import Actions.Commands;
import Actions.Verification;
import Cars.Car;
import Cars.PassengerCarBody.Crossover;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWCapacity.BMWCrossoverHighCapacity;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWCrossover;
import DataBase.CarsHandler;
import DataBase.DBHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Commands menu = new Commands();
        Scanner cin = new Scanner(System.in);
//        DBHandler dbHandler = new DBHandler();
        ArrayList<Car> cars = new ArrayList<>();
//        dbHandler.updateCars(cars);
//
//
//        int menuNum;
//        while(true) {
//            menu.initialCommands();
//            menuNum = cin.nextInt();
//            if(menuNum==0) {
//                System.out.println("You left the menu");
//                break;
//            } else if (menuNum == 1) {
//                boolean answer = new Verification().isValidManager(dbHandler);
//                CarsHandler carsHandler = new CarsHandler();
//                ActionsWithCar actionsWithCar = new ActionsWithCar(cars, carsHandler);
//                while (answer) {
//                    menu.managerCommands();
//                    menuNum = cin.nextInt();
//                    if (menuNum == 0) {
//                        break;
//                    } else if(menuNum == 1) {
//                        // adding a car
//                        actionsWithCar.add();
//                    } else if(menuNum == 2) {
//                        // removing a car
//                        actionsWithCar.remove();
//                    } else if(menuNum == 3) {
//                        // getting info about certain car
//                        actionsWithCar.getCertainCar();
//                    } else if(menuNum == 4) {
//                        // getting info about all cars
//                        actionsWithCar.getAllCars();
//                    } else if(menuNum == 5) {
//                        // getting info about customers
//                        actionsWithCar.getCustomers();
//                    }
//                }
//            } else if (menuNum == 2) {
//                while(true) {
//                    menu.customerCommands();
//                    menuNum = cin.nextInt();
//                    if (menuNum == 0) {
//                        break;
//                    } else if(menuNum == 1) {
//
//                    }
//                }
//            }
//        }

    }
}
package Actions;

import Cars.Car;
import Cars.CommercialCar;
import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;
import DataBase.CarsHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ActionsWithCar {
    ArrayList<PassengerCarBody> passengerCars;
    ArrayList<CommercialCarBody> commercialCars;
    Scanner cin;
    CarsHandler carsHandler;
    public ActionsWithCar(ArrayList<PassengerCarBody> passengerCars, ArrayList<CommercialCarBody> commercialCars, CarsHandler carsHandler) {
        this.passengerCars = passengerCars;
        this.commercialCars = commercialCars;
        this.carsHandler = carsHandler;
        cin = new Scanner(System.in);
    }

    public void add() throws SQLException {
        System.out.println("What type of car do you want to add?");
        System.out.println("1.Passenger \n2.Commercial ");
        System.out.print("Choose one of them: ");
        int typeOfCar = cin.nextInt();
        String type;
        switch (typeOfCar) {
            case 1 -> type = "Passenger";
            case 2 -> type = "Commercial";
            default -> {
                System.out.println("Sorry, we don't have the type of car like yours");
                return;
            }
        }


        String manufacturer;
        if (type.equals("Passenger")) {
            System.out.println("Manufacturer: ");
            System.out.println("1.Mercedes \n2.BMW \n3.Volvo \n4.Hyundai ");
            System.out.print("Enter one of them: ");
            int manufacturerNum = cin.nextInt();
            switch (manufacturerNum) {
                case 1 -> manufacturer = "Mercedes";
                case 2 -> manufacturer = "BMW";
                case 3 -> manufacturer = "Volvo";
                case 4 -> manufacturer = "Hyundai";
                default -> {
                    System.out.println("Sorry, we don't have the manufacturer like yours");
                    return;
                }
            }
        } else {
            System.out.println("Manufacturer: ");
            System.out.println("1.Mercedes \n2.Hyundai \n3.Volvo ");
            System.out.print("Enter one of them: ");
            int manufacturerNum = cin.nextInt();
            switch (manufacturerNum) {
                case 1 -> manufacturer = "Mercedes";
                case 2 -> manufacturer = "Hyundai";
                case 3 -> manufacturer = "Volvo";
                default -> {
                    System.out.println("Sorry, we don't have the manufacturer like yours");
                    return;
                }
            }
        }


        String body;
        if (type.equals("Passenger")) {
            System.out.println("Body: ");
            if (manufacturer.equals("Mercedes")) {
                System.out.println("1.Crossover \n2.MiniVan \n3.Sedan \n4.SUV ");
                System.out.print("Enter one of them: ");
                int bodyNum = cin.nextInt();
                switch (bodyNum) {
                    case 1 -> body = "Crossover";
                    case 2 -> body = "MiniVan";
                    case 3 -> body = "Sedan";
                    case 4 -> body = "SUV";
                    default -> {
                        System.out.println("Sorry, we don't have the body like yours");
                        return;
                    }
                }
            } else if(manufacturer.equals("BMW") || manufacturer.equals("Volvo")) {
                System.out.println("1.Crossover \n2.Sedan ");
                System.out.print("Enter one of them: ");
                int bodyNum = cin.nextInt();
                switch (bodyNum) {
                    case 1 -> body = "Crossover";
                    case 2 -> body = "Sedan";
                    default -> {
                        System.out.println("Sorry, we don't have the body like yours");
                        return;
                    }
                }
            } else {
                System.out.println("1.Crossover \n2.MiniVan \n3.Sedan ");
                System.out.print("Enter one of them: ");
                int bodyNum = cin.nextInt();
                switch (bodyNum) {
                    case 1 -> body = "Crossover";
                    case 2 -> body = "MiniVan";
                    case 3 -> body = "Sedan";
                    default -> {
                        System.out.println("Sorry, we don't have the body like yours");
                        return;
                    }
                }
            }

        } else {
            System.out.println("Body: ");
            if (manufacturer.equals("Hyundai")) {
                System.out.println("1.Refrigerator \n2.Bus \n3.Van ");
                System.out.print("Enter one of them: ");
                int manufacturerNum = cin.nextInt();
                switch (manufacturerNum) {
                    case 1 -> body = "Refrigerator";
                    case 2 -> body = "Bus";
                    case 3 -> body = "Van";
                    default -> {
                        System.out.println("Sorry, we don't have the body like yours");
                        return;
                    }
                }
            } else if(manufacturer.equals("Mercedes")) {
                System.out.println("1.Refrigerator \n2.Bus \n3.Van \n4.Truck ");
                System.out.print("Enter one of them: ");
                int manufacturerNum = cin.nextInt();
                switch (manufacturerNum) {
                    case 1 -> body = "Refrigerator";
                    case 2 -> body = "Bus";
                    case 3 -> body = "Van";
                    case 4 -> body = "Truck";
                    default -> {
                        System.out.println("Sorry, we don't have the body like yours");
                        return;
                    }
                }
            } else {
                System.out.println("1.Refrigerator \n2.Bus \n3.Truck ");
                System.out.print("Enter one of them: ");
                int manufacturerNum = cin.nextInt();
                switch (manufacturerNum) {
                    case 1 -> body = "Refrigerator";
                    case 2 -> body = "Bus";
                    case 3 -> body = "Truck";
                    default -> {
                        System.out.println("Sorry, we don't have the body like yours");
                        return;
                    }
                }
            }

        }
        System.out.print("Engine capacity: ");
        float engineCapacity = cin.nextFloat();
        System.out.print("Fuel: ");
        String fuel = cin.next();
        System.out.print("Color: ");
        String color = cin.next();
        System.out.print("Amount of seats: ");
        int numOfSeats = cin.nextInt();
        String transmission = "AWD";
        if (type.equals("Passenger")) {
            System.out.print("Transmission: ");
            transmission = cin.next();
        }
        System.out.print("Mileage: ");
        int mileage = cin.nextInt();
        System.out.print("Model: ");
        String model = cin.next();
        carsHandler.addCar(type, manufacturer, body, engineCapacity, fuel, color, numOfSeats, transmission, mileage, model);
        carsHandler.updatePassengerCars(passengerCars);
        carsHandler.updateCommercialCars(commercialCars);
        System.out.println("You have successfully added the car!!!");
    }

    public void remove() throws SQLException {
        System.out.print("Enter the car id to delete");
        System.out.print("ID: ");
        int id = cin.nextInt();
        carsHandler.removeCar(id);
        carsHandler.updatePassengerCars(passengerCars);
        carsHandler.updateCommercialCars(commercialCars);
        System.out.println("You have successfully removed the car!!!");
    }

    public void getAllCars() {
        int k = 1;
        for (int i = 0; i < passengerCars.size(); ++i) {
            System.out.println(k++);
            System.out.println(passengerCars.get(i).toString());
        }
        for (int i = 0; i < commercialCars.size(); ++i) {
            System.out.println(k++);
            System.out.println(commercialCars.get(i).toString());
        }
    }

    public void getByType(String type) {
        for (int i = 0; i < passengerCars.size(); ++i) {
            if(passengerCars.get(i).getType().equals(type)) {
                System.out.println(passengerCars.get(i).toString());
            }
        }
        for (int i = 0; i < commercialCars.size(); ++i) {
            if(commercialCars.get(i).getType().equals(type)) {
                System.out.println(commercialCars.get(i).toString());
            }

        }
    }

    public void getByBody(String body) {
        for(int i = 0; i < passengerCars.size(); ++i) {
            if (passengerCars.get(i).getBody().equals(body)) {
                System.out.println(passengerCars.get(i).toString());
            }
        }
        for (int i = 0; i < commercialCars.size(); ++i) {
            if(commercialCars.get(i).getBody().equals(body)) {
                System.out.println(commercialCars.get(i).toString());
            }

        }
    }

    public void getByBrand(String brand) {
        for(int i = 0; i < passengerCars.size(); ++i) {
            if (passengerCars.get(i).getManufacturer().equals(brand)) {
                System.out.println(passengerCars.get(i).toString());
            }
        }
        for (int i = 0; i < commercialCars.size(); ++i) {
            if(commercialCars.get(i).getManufacturer().equals(brand)) {
                System.out.println(commercialCars.get(i).toString());
            }
        }
    }
}


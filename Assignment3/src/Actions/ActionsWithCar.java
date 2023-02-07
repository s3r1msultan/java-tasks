package Actions;

import Cars.Car;
import DataBase.CarsHandler;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionsWithCar {
    ArrayList<Car> cars;
    Scanner cin;
    CarsHandler carsHandler;
    public ActionsWithCar(ArrayList<Car> cars, CarsHandler carsHandler) {
        this.cars = cars;
        this.carsHandler = carsHandler;
        cin = new Scanner(System.in);
    }

    public void add() {

    }

    public void remove() {
    }

    public void getCertainCar() {
    }

    public void getAllCars() {
    }

    public void getCustomers() {
    }
}

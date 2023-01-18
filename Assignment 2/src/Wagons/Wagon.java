package Wagons;

import Passengers.Passenger;

import java.util.ArrayList;

public class Wagon {
    protected int price;
    protected int maxNumberOfPassengers;
    protected String nameOfWagon;
    protected ArrayList<Passenger> passengers = new ArrayList<>();

    public int getPrice() {
        return price;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public int getNumberOfAvailableSeats() {
        return maxNumberOfPassengers - passengers.size();
    }

    public int getNumberOfReservedSeats() {
        return passengers.size();
    }

    public String getNameOfWagon() {
        return nameOfWagon;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}

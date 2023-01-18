package Wagons;

import Passengers.Passenger;

import java.util.ArrayList;

public class Wagon {
    protected int price;
    protected int maxNumberOfPassengers;
    protected String typeOfWagon;
    protected ArrayList<Passenger> passengers = new ArrayList<>();

    public String getInfo() {
        return "Type: " + typeOfWagon + "\n" +
                "Maximum number of passengers: " + maxNumberOfPassengers + '\n' +
                "Number of available seats: " + getNumberOfAvailableSeats() + '\n' +
                "Price: " + price + " kzt" + '\n';
    }

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

    public String getTypeOfWagon() {
        return typeOfWagon;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

}

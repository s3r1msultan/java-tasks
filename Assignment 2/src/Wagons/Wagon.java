package Wagons;

import Passengers.Passenger;

import java.util.ArrayList;

public class Wagon {
    protected int price;
    protected int maxNumberOfPassengers;



    protected int idWagon;
    protected String typeOfWagon;
    protected ArrayList<Passenger> passengers = new ArrayList<>();

    public String getInfo(boolean isManager) {
        if(isManager) {
            return "Type of wagon: " + typeOfWagon + "\n" +
                    "Maximum number of passengers: " + maxNumberOfPassengers + '\n' +
                    "Number of available seats: " + getNumberOfAvailableSeats() + '\n' +
                    "Price: " + price + " kzt" + '\n' +
                    "ID: " + idWagon + "\n";
        }
        return "Type of wagon: " + typeOfWagon + "\n" +
                "Price: " + price + " kzt" + '\n' +
                "ID: " + idWagon + "\n";
    }
    public int getIdWagon() {
        return idWagon;
    }

    public void setIdWagon(int idWagon) {
        this.idWagon = idWagon;
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

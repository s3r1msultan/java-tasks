import Cars.Car;
import Cars.CommercialCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWCrossover;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWSedan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        BMWSedan bmwCrossover = new BMWSedan();
        HighCapacity capacity = new HighCapacity();
        capacity.setCapacity((float) 4.3);
        System.out.println(capacity.getCapacity());
    }
}
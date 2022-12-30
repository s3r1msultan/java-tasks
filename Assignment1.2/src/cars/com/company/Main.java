package cars.com.company;

import cars.com.company.details.Engine;
import cars.com.company.professions.Driver;
import cars.com.company.vehicles.Car;
import cars.com.company.vehicles.Lorry;
import cars.com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine motor = new Engine("General Motors", 652);
        Engine motor1 = new Engine("Mercedes-Benz", 1000);
        Driver Andrey = new Driver("Kolesnikov Andrey", 18, 0.5f);
        Car tahoe = new Car("Chevrolet", "J", 2.5f, Andrey, motor);
        System.out.println(tahoe.toString());
        SportCar m5 = new SportCar("BMW", "M", 1.8f, 500, Andrey, motor1);
        System.out.println(m5.toString());
        Lorry something = new Lorry("some brand", "some class", 3, 10, Andrey, motor1);
        System.out.println(something.toString());
    }
}

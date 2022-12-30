package cars.com.company.vehicles;

import cars.com.company.details.Engine;
import cars.com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;
    public SportCar(String carBrand, String carClass, float weight, double speed, Driver driver, Engine motor) {
        super(carBrand, carClass, weight, driver, motor);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + "Speed: " + speed + "\n";
    }

    public double getSpeed() {
        return speed;
    }
}

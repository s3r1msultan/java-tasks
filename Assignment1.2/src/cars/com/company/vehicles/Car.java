package cars.com.company.vehicles;
import cars.com.company.professions.Driver;
import cars.com.company.details.Engine;
public class Car {
    private String carBrand;
    private String carClass;
    private float weight;
    private Driver driver;
    private Engine motor;

    public Car(String carBrand, String carClass, float weight, Driver driver, Engine motor) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    public void start() {
        System.out.println("Let's go");
    }
    public void stop() {
        System.out.println("Let's stop");
    }
    public void turnRight() {
        System.out.println("Turn right");
    }
    public void turnLeft() {
        System.out.println("Turn left");
    }
    public String toString() {
        return "Brand: " + carBrand + '\n' + "Class: " + carClass + "\n" + "Weight: " + weight + " ton" + "\n" + "Driver: " + "\n" + driver.toString() + "Engine: " + "\n" + motor.toString();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public float getWeight() {
        return weight;
    }
}

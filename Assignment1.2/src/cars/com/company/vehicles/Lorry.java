package cars.com.company.vehicles;

import cars.com.company.details.Engine;
import cars.com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;
    public Lorry(String carBrand, String carClass, float weight, int carrying, Driver driver, Engine motor) {
        super(carBrand, carClass, weight, driver, motor);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() + "Carrying: " + carrying + "\n";
    }

    public int getCarrying(){
        return carrying;
    }
}

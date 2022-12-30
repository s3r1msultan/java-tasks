package cars.com.company.details;

public class Engine {
    private int power;
    private String manufacturer;

    public Engine(String manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public String toString() {
        return "\t" + "Company: " + manufacturer + "\n" + "\t" + "Power: " + power + " horsepower"+ "\n";
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

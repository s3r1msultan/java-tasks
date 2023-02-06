package Cars;

abstract public class Car {
    protected float engineCapacity;
    protected String manufacturer;
    private String fuel;
    private String color;
    private int year;
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    protected float getEngineCapacity() {
        return engineCapacity;
    }
    protected void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

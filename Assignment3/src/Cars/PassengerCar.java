package Cars;

abstract public class PassengerCar extends Car{
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    protected String transmission;
}

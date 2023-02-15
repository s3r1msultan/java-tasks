package Cars;

abstract public class PassengerCar extends Car{
    private String transmission;
    public PassengerCar() {
        setType("Passenger");
    }
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

}

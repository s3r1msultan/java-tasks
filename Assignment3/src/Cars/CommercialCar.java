package Cars;

abstract public class CommercialCar extends Car{
    protected final String transmission = "AWD";

    public String getTransmission() {
        return transmission;
    }
}

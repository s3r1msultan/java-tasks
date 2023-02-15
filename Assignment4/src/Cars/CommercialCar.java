package Cars;

import Cars.CommercialCarBody.CommercialCarBody;

abstract public class CommercialCar extends Car{
    protected final String transmission = "AWD";
    public CommercialCar() {
        setType("Commercial");
    }

    public String getTransmission() {
        return transmission;
    }
}

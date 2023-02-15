package Factories.CarFactory;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;
import Factories.BodyFactory.CommercialCarBody.*;
import Factories.BodyFactory.PassengerCarBody.*;

public class BMWFactory implements CarFactory{
    private final String manufacturer = "BMW";
    @Override
    public PassengerCarBody createPassengerCarBody(String body) {
        PassengerCarBodyFactory passengerCarBodyFactory = getPassengerCarBodyFactory(body);
        return passengerCarBodyFactory.createPassengerCarBody(manufacturer);
    }

    @Override
    public CommercialCarBody createCommercialCarBody(String body) {
        throw new RuntimeException(manufacturer + " doesn't have commercial cars");
    }
}

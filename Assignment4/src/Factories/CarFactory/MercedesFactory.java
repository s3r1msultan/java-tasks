package Factories.CarFactory;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;
import Factories.BodyFactory.CommercialCarBody.*;
import Factories.BodyFactory.PassengerCarBody.*;

public class MercedesFactory implements CarFactory {
    private final String manufacturer = "Mercedes";

    @Override
    public PassengerCarBody createPassengerCarBody(String body) {
        PassengerCarBodyFactory passengerCarBodyFactory = getPassengerCarBodyFactory(body);
        return passengerCarBodyFactory.createPassengerCarBody(manufacturer);
    }

    @Override
    public CommercialCarBody createCommercialCarBody(String body) {
        CommercialCarBodyFactory commercialCarBodyFactory = getCommercialCarBodyFactory(body);
        return commercialCarBodyFactory.createCommercialCarBody(manufacturer);
    }
}

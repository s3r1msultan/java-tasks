package Factories.CarFactory;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;
import Factories.BodyFactory.CommercialCarBody.CommercialCarBodyFactory;
import Factories.BodyFactory.PassengerCarBody.PassengerCarBodyFactory;

public class VolvoFactory implements CarFactory{
    private final String manufacturer = "Volvo";
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

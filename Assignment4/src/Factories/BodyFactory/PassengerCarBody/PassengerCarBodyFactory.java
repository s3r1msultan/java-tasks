package Factories.BodyFactory.PassengerCarBody;

import Cars.PassengerCarBody.PassengerCarBody;

public interface PassengerCarBodyFactory {
    public PassengerCarBody createPassengerCarBody(String manufacturer);
}

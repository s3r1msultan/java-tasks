package Factories.BodyFactory.PassengerCarBody;

import Cars.PassengerCarBody.Manufacturers.BMW.BMWSedan;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiSedan;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercSedan;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoSedan;
import Cars.PassengerCarBody.PassengerCarBody;

public class SedanFactory implements PassengerCarBodyFactory{

    public PassengerCarBody createPassengerCarBody(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("mercedes")) {
            return new MercSedan();
        } else if (manufacturer.equalsIgnoreCase("bmw")) {
            return new BMWSedan();
        } else if (manufacturer.equalsIgnoreCase("hyundai")) {
            return new HyundaiSedan();
        } else if (manufacturer.equalsIgnoreCase("volvo")) {
            return new VolvoSedan();
        } else {
            throw new RuntimeException(manufacturer + "is unknown manufacturer to create a sedan");
        }
    }
}

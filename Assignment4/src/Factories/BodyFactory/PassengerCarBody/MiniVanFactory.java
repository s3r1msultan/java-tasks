package Factories.BodyFactory.PassengerCarBody;

import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCrossover;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercMiniVan;
import Cars.PassengerCarBody.PassengerCarBody;

public class MiniVanFactory implements PassengerCarBodyFactory{

    public PassengerCarBody createPassengerCarBody(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("mercedes")) {
            return new MercMiniVan();
        } else if (manufacturer.equalsIgnoreCase("hyundai")) {
            return new HyundaiCrossover();
        } else {
            throw new RuntimeException(manufacturer + "is unknown manufacturer to create a mini van");
        }
    }
}

package Factories.BodyFactory.PassengerCarBody;

import Cars.PassengerCarBody.Manufacturers.BMW.BMWCrossover;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCrossover;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercCrossover;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercSUV;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCrossover;
import Cars.PassengerCarBody.PassengerCarBody;

public class SUVFactory implements PassengerCarBodyFactory{
    public PassengerCarBody createPassengerCarBody(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("mercedes")) {
            return new MercSUV();
        } else {
            throw new RuntimeException(manufacturer + "is unknown manufacturer to create a SUV");
        }
    }
}

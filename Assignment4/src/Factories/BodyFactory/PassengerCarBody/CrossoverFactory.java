package Factories.BodyFactory.PassengerCarBody;

import Cars.PassengerCarBody.Manufacturers.BMW.BMWCrossover;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCrossover;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercCrossover;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCrossover;
import Cars.PassengerCarBody.PassengerCarBody;

public class CrossoverFactory implements PassengerCarBodyFactory{

    @Override
    public PassengerCarBody createPassengerCarBody(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("mercedes")) {
            return new MercCrossover();
        } else if (manufacturer.equalsIgnoreCase("bmw")) {
            return new BMWCrossover();
        } else if (manufacturer.equalsIgnoreCase("hyundai")) {
            return new HyundaiCrossover();
        } else if (manufacturer.equalsIgnoreCase("volvo")) {
            return new VolvoCrossover();
        } else {
            throw new RuntimeException(manufacturer + "is unknown manufacturer to create a crossover");
        }
    }
}

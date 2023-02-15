package Factories.CarFactory;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;
import Factories.BodyFactory.CommercialCarBody.*;
import Factories.BodyFactory.PassengerCarBody.*;

public interface CarFactory {
    public PassengerCarBody createPassengerCarBody(String body);
    public CommercialCarBody createCommercialCarBody(String body);

    public default PassengerCarBodyFactory getPassengerCarBodyFactory(String body) {
        if (body.equalsIgnoreCase("crossover")) {
            return new CrossoverFactory();
        } else if (body.equalsIgnoreCase("sedan")) {
            return new SedanFactory();
        } else if (body.equalsIgnoreCase("minivan")) {
            return new MiniVanFactory();
        } else if (body.equalsIgnoreCase("suv")) {
            return new SUVFactory();
        } else {
            throw new RuntimeException(body + " is unknown");
        }
    }

    public default CommercialCarBodyFactory getCommercialCarBodyFactory(String body) {
        if (body.equalsIgnoreCase("bus")) {
            return new BusFactory();
        } else if (body.equalsIgnoreCase("refrigerator")) {
            return new RefrigeratorFactory();
        } else if (body.equalsIgnoreCase("truck")) {
            return new TruckFactory();
        } else if (body.equalsIgnoreCase("van")) {
            return new VanFactory();
        } else {
            throw new RuntimeException(body + " is unknown");
        }
    }
}

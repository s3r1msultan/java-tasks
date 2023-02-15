package Factories.BodyFactory.CommercialCarBody;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.CommercialCarBody.Manufacturers.Mercedes.MercTruck;
import Cars.CommercialCarBody.Manufacturers.Volvo.VolvoTruck;

public class TruckFactory implements CommercialCarBodyFactory{
    public CommercialCarBody createCommercialCarBody(String manufacturer) {
         if(manufacturer.equalsIgnoreCase("mercedes")) {
            return new MercTruck();
        } else if(manufacturer.equalsIgnoreCase("volvo")) {
            return new VolvoTruck();
        } else {
            throw new RuntimeException(manufacturer + " is unkown manufacturer to create a truck");
        }
    }
}

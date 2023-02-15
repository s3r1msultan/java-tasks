package Factories.BodyFactory.CommercialCarBody;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.CommercialCarBody.Manufacturers.Hyundai.HyundaiRefrigerator;
import Cars.CommercialCarBody.Manufacturers.Mercedes.MercRefrigerator;
import Cars.CommercialCarBody.Manufacturers.Volvo.VolvoRefrigerator;

public class RefrigeratorFactory implements CommercialCarBodyFactory{
    public CommercialCarBody createCommercialCarBody(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("hyundai")) {
            return new HyundaiRefrigerator();
        } else if(manufacturer.equalsIgnoreCase("mercedes")) {
            return new MercRefrigerator();
        } else if(manufacturer.equalsIgnoreCase("volvo")) {
            return new VolvoRefrigerator();
        } else {
            throw new RuntimeException(manufacturer + " is unknown manufacturer to create a refrigerator");
        }
    }
}

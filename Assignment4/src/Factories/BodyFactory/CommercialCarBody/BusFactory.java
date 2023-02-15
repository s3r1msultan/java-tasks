package Factories.BodyFactory.CommercialCarBody;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.CommercialCarBody.Manufacturers.Hyundai.HyundaiBus;
import Cars.CommercialCarBody.Manufacturers.Mercedes.MercBus;
import Cars.CommercialCarBody.Manufacturers.Volvo.VolvoBus;

public class BusFactory implements CommercialCarBodyFactory{
    @Override
    public CommercialCarBody createCommercialCarBody(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("hyundai")) {
            return new HyundaiBus();
        } else if(manufacturer.equalsIgnoreCase("mercedes")) {
            return new MercBus();
        } else if(manufacturer.equalsIgnoreCase("volvo")) {
            return new VolvoBus();
        } else {
            throw new RuntimeException(manufacturer + " is unknown manufacturer to create a bus");
        }
    }
}

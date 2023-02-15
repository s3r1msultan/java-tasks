package Factories.BodyFactory.CommercialCarBody;

import Cars.CommercialCarBody.CommercialCarBody;
import Cars.CommercialCarBody.Manufacturers.Hyundai.HyundaiVan;
import Cars.CommercialCarBody.Manufacturers.Mercedes.MercVan;

public class VanFactory implements CommercialCarBodyFactory{
    public CommercialCarBody createCommercialCarBody(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("hyundai")) {
            return new HyundaiVan();
        } else if(manufacturer.equalsIgnoreCase("mercedes")) {
            return new MercVan();
        } else {
            throw new RuntimeException(manufacturer + " is unknown manufacturer to create a van");
        }
    }
}

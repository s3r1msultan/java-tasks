package Factories.BodyFactory.CommercialCarBody;

import Cars.CommercialCarBody.CommercialCarBody;

public interface CommercialCarBodyFactory {
    public CommercialCarBody createCommercialCarBody(String manufacturer);
}

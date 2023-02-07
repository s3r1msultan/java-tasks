package Cars.PassengerCarBody.Manufacturers.Mercedes.MercCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercSedan;

public class MercSedanHighCapacity extends MercSedan {
    public MercSedanHighCapacity() {
        super();
        capacity = new HighCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

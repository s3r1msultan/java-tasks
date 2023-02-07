package Cars.PassengerCarBody.Manufacturers.Mercedes.MercCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercCrossover;

public class MercCrossoverHighCapacity extends MercCrossover {
    public MercCrossoverHighCapacity() {
        super();
        capacity = new HighCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

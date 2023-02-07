package Cars.PassengerCarBody.Manufacturers.Mercedes.MercCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.MediumCapacity;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercCrossover;

public class MercCrossoverMediumCapacity extends MercCrossover {
    public MercCrossoverMediumCapacity() {
        super();
        capacity = new MediumCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

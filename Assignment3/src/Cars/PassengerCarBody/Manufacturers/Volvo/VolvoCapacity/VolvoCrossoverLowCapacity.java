package Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.LowCapacity;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCrossover;

public class VolvoCrossoverLowCapacity extends VolvoCrossover {
    public VolvoCrossoverLowCapacity() {
        super();
        capacity = new LowCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

package Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCrossover;

public class VolvoCrossoverHighCapacity extends VolvoCrossover {
    public VolvoCrossoverHighCapacity() {
        super();
        capacity = new HighCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

package Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoSedan;

public class VolvoSedanHighCapacity extends VolvoSedan {
    public VolvoSedanHighCapacity() {
        super();
        capacity = new HighCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

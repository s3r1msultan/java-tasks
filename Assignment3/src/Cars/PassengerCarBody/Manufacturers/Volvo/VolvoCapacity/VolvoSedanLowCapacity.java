package Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCapacity;

import Cars.PassengerCarBody.EngineCapacity.LowCapacity;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoSedan;

public class VolvoSedanLowCapacity extends VolvoSedan {
    public VolvoSedanLowCapacity() {
        super();
        capacity = new LowCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

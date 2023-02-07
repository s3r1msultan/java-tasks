package Cars.PassengerCarBody.Manufacturers.BMW.BMWCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.LowCapacity;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWCrossover;

public class BMWCrossoverLowCapacity extends BMWCrossover {
    public BMWCrossoverLowCapacity() {
        super();
        capacity = new LowCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

package Cars.PassengerCarBody.Manufacturers.BMW.BMWCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWCrossover;

public class BMWCrossoverHighCapacity extends BMWCrossover {
    public BMWCrossoverHighCapacity() {
        super();
        capacity = new HighCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

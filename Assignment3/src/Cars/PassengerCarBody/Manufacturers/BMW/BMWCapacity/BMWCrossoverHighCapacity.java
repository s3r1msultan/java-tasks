package Cars.PassengerCarBody.Manufacturers.BMW.BMWCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWCrossover;

public class BMWCrossoverHighCapacity extends BMWCrossover {
    public BMWCrossoverHighCapacity() {
        capacity = new HighCapacity();
        super.maxCapacity = capacity.maxCapacity;
        super.minCapacity = capacity.minCapacity;
    }
}

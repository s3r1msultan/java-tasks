package Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCrossover;

public class HyundaiCrossoverHighCapacity extends HyundaiCrossover {
    public HyundaiCrossoverHighCapacity() {
        super();
        capacity = new HighCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

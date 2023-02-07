package Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiSedan;

public class HyundaiSedanHighCapacity extends HyundaiSedan {
    public HyundaiSedanHighCapacity() {
        super();
        capacity = new HighCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

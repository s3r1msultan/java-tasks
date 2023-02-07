package Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.LowCapacity;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiSedan;

public class HyundaiSedanLowCapacity extends HyundaiSedan {
    public HyundaiSedanLowCapacity() {
        super();
        capacity = new LowCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

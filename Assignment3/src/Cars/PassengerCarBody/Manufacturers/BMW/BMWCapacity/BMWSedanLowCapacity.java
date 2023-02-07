package Cars.PassengerCarBody.Manufacturers.BMW.BMWCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.LowCapacity;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWSedan;

public class BMWSedanLowCapacity extends BMWSedan {
    public BMWSedanLowCapacity() {
        super();
        capacity = new LowCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

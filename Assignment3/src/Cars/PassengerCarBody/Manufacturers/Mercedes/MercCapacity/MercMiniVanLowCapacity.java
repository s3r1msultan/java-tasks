package Cars.PassengerCarBody.Manufacturers.Mercedes.MercCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.LowCapacity;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercMiniVan;

public class MercMiniVanLowCapacity extends MercMiniVan {
    public MercMiniVanLowCapacity() {
        super();
        capacity = new LowCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

package Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.MediumCapacity;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiMinivan;

public class HyundaiMinivanMediumCapacity extends HyundaiMinivan {
    public HyundaiMinivanMediumCapacity() {
        super();
        capacity = new MediumCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

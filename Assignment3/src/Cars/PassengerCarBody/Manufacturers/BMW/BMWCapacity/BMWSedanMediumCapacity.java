package Cars.PassengerCarBody.Manufacturers.BMW.BMWCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.MediumCapacity;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWSedan;

public class BMWSedanMediumCapacity extends BMWSedan {
    public BMWSedanMediumCapacity() {
        super();
        capacity = new MediumCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}

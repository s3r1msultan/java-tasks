package Cars.PassengerCarBody;

import Cars.PassengerCar;
import Cars.PassengerCarBody.EngineCapacity.Capacity;

public abstract class Body extends PassengerCar {
    protected String body;
    protected int numOfSeats;
    protected Capacity capacity;
    protected float minCapacity;
    protected float maxCapacity;
}

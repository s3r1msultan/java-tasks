package Cars.PassengerCarBody;

import Cars.PassengerCar;
import Cars.PassengerCarBody.EngineCapacity.Capacity;

public abstract class Body extends PassengerCar {

    protected String body;
    protected int numOfSeats;
    protected Capacity capacity;
    protected float minCapacity;
    protected float maxCapacity;
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public float getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(float minCapacity) {
        this.minCapacity = minCapacity;
    }

    public float getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(float maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

}

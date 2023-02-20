package Cars.PassengerCarBody;

import Cars.PassengerCar;

public abstract class PassengerCarBody extends PassengerCar {

    protected String body;
    protected int numOfSeats;

    public String getBody() {
        return body;
    }

    protected void setBody(String body) {
        this.body = body;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String toString() {
        return  "Model: " + getModel() + '\n' +
                "Type: " + getType() + '\n' +
                "Manufacturer: " + getManufacturer() + '\n' +
                "Body type: " + getBody() + '\n' +
                "Year: " + getYear() + '\n' +
                "Mileage: " + getMileage() + '\n' +
                "Engine capacity: " + getEngineCapacity() + '\n' +
                "Fuel type: " + getFuel() + '\n' +
                "Color: " + getColor() + '\n' +
                "Amount of seats: " + getNumOfSeats() + '\n' +
                "Transmission: " + getTransmission() + '\n' +
                "Price: " + getPrice() + '\n' +
                "Amount: " + getAmount() + '\n';
    }

}

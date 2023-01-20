package Passengers;

public class Disabled extends Passenger{
    public Disabled(String firstName, String lastName, int age, String ticketNumber) {
        super(firstName, lastName, age, ticketNumber);
        discount = 50;
    }
}

package Passengers;

public class Elderly extends Passenger{
    public Elderly(String firstName, String lastName, int age, String ticketNumber) {
        super(firstName, lastName, age, ticketNumber);
        discount = 25;
    }
}

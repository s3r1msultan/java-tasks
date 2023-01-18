package Passengers;

public class Elderly extends Passenger{
    public Elderly(int age, String firstName, String lastName, String ticketNumber) {
        super(age, firstName, lastName, ticketNumber);
        discount = 25;
    }
}

package Passengers;

public class Invalid extends Passenger{
    public Invalid(String firstName, String lastName, int age, String ticketNumber) {
        super(firstName, lastName, age, ticketNumber);
        discount = 50;
    }
}

package Passengers;

public class Invalid extends Passenger{
    public Invalid(int age, String firstName, String lastName, String ticketNumber) {
        super(age, firstName, lastName, ticketNumber);
        discount = 50;
    }
}

package Passengers;

public class Child extends Passenger{
    public Child(int age, String firstName, String lastName, String ticketNumber) {
        super(age, firstName, lastName, ticketNumber);
        discount = 50;
    }
}

package Passengers;

public class Child extends Passenger{
    public Child(String firstName, String lastName, int age, String ticketNumber) {
        super(firstName, lastName, age, ticketNumber);
        discount = 50;
    }
}

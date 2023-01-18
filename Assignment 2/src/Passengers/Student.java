package Passengers;

public class Student extends Passenger{

    public Student( String firstName, String lastName, int age, String ticketNumber) {
        super(firstName, lastName, age, ticketNumber);
        discount = 10;
    }
}

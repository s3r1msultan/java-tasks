package Passengers;

public class Student extends Passenger{

    public Student(int age, String firstName, String lastName, String ticketNumber) {
        super(age, firstName, lastName, ticketNumber);
        discount = 10;
    }
}

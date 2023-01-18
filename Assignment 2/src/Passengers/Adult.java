package Passengers;

public class Adult extends Passenger{

    public Adult( String firstName, String lastName, int age, String ticketNumber) {
        super(firstName, lastName, age, ticketNumber);
        discount = 0;
    }
}

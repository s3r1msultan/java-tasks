package Passengers;

public class Adult extends Passenger{

    public Adult(int age, String firstName, String lastName, String ticketNumber) {
        super(age, firstName, lastName, ticketNumber);
        discount = 0;
    }
}

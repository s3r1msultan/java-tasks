package Passengers;

public class Passenger {
    private int age;
    private String firstName;
    private String lastName;
    private String ticketNumber;
    protected int discount;

    public Passenger(String firstName, String lastName, int age, String ticketNumber) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
    }

    public float ticketPrice(int price) {
        return price*(1 - (float) discount/100);
    }

    public String getInfo() {
        return "First name: " + firstName + '\n' +
                "Last name: " + lastName + '\n' +
                "Age: " + age + '\n' +
                "Class: " + getClass().getSimpleName() + '\n' +
                "Ticket number: " + ticketNumber;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }
}

package Passengers;

public class Passenger {
    private int age;
    private String firstName;
    private String lastName;
    private String ticketNumber;
    protected int discount;

    public Passenger(int age, String firstName, String lastName, String ticketNumber) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
    }

    public float ticketPrice(int price) {
        return price*(1 - (float) discount/100);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}

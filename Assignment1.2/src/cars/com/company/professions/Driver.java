package cars.com.company.professions;

public class Driver extends Person {
    private float drivingExperience;

    public Driver(String fullName, int age, float drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    public String toString() {
        return super.toString() + "\t" +"Driving experience: " + drivingExperience + " years" +"\n";
    }

    public float getDrivingExperience() {
        return drivingExperience;
    }
}

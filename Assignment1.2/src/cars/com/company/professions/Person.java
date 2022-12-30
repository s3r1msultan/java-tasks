package cars.com.company.professions;

public class Person {
    private int age;
    private String fullName;

    public String toString() {
        return "\t" + "Age: " + age + " years old" + "\n" + "\t" + "Full name: " + fullName + "\n";
    }

    public Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }
}

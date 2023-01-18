package personClass;

public class Person {
    private String fullName;
    private byte age;

    public void move() {
        System.out.println(getFullName() + "is moving");
    }
    public void talk() {
        System.out.println(getFullName() + "is talking");
    }

    public Person() {

    }

    public Person(String fullName, byte age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}

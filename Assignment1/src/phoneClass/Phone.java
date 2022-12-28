package phoneClass;

public class Phone {
    private String number;
    private String model;
    private String name;
    private float weight;
    public Phone() {

    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, String name, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
    }
    public void printValues() {
        System.out.println("Name: " + getName() + '\n' + "Number: " + getNumber() + '\n' + "Model: " + getModel() + '\n' + "Weight: " + getWeight() + '\n');
    }
    public void receiveCall() {
        System.out.println(name + " is ringing");
    }
    public void receiveCall(String name) {
        System.out.println(name + " is ringing");
    }
    public void receiveCall(String name, String number) {
        System.out.println(name + " is ringing by this number: " + number);

    }
    public void sendMessage(String ... numbers) {
        System.out.println("Amount of numbers: " + numbers.length);
        System.out.println("Numbers: ");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.println((i+1) + " number: " + numbers[i]);
        }
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

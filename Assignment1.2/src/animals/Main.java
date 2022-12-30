package animals;

public class Main {
    public static void main(String[] args) {
        Veterinary veterinary = new Veterinary();
        Dog dog = new Dog("meal", "home", true);
        Cat cat = new Cat("whiskas", "out of home", true);
        Horse horse = new Horse("hay", "field", true);
        Animal[] animals = {dog, cat, horse};
        for (Animal el: animals) {
            veterinary.treatAnimal(el);
        }
    }
}

package animals;

public class Dog extends Animal{
    private boolean isTrained;
    public Dog() {

    }
    public Dog(String food, String location, boolean isTrained) {
        super(food, location);
        this.isTrained = isTrained;
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}

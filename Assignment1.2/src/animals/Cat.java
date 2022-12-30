package animals;

public class Cat extends Animal{
    private boolean isMewing;
    public Cat() {

    }
    public Cat(String food, String location, boolean isMewing) {
        super(food, location);
        this.isMewing = isMewing;
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
    @Override
    public void makeNoise() {
        System.out.println("Cat is making noise");
    }

    public boolean isMewing() {
        return isMewing;
    }

    public void setMewing(boolean mewing) {
        isMewing = mewing;
    }
}

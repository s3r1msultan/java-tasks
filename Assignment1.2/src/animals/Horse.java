package animals;

public class Horse extends Animal{
    private boolean hasNeighing;
    public Horse(){

    }
    public Horse(String food, String location, boolean hasNeighing) {
        super(food, location);
        this.hasNeighing = hasNeighing;
    }
    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }
    @Override
    public void makeNoise() {
        System.out.println("Horse is making noise");
    }

    public boolean isHasNeighing() {
        return hasNeighing;
    }

    public void setHasNeighing(boolean hasNeighing) {
        this.hasNeighing = hasNeighing;
    }
}

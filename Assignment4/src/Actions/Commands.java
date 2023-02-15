package Actions;

public class Commands {
    private void separator() {
        System.out.println("####################################");
    }

    public void initialCommands() {
        separator();
        System.out.println("Who are you?");
        System.out.println("1 - Manager");
        System.out.println("2 - Customer");
        System.out.println("0 - Exit");
        separator();
    }

    public void managerCommands() {
        separator();
        System.out.println("Manager menu");
        System.out.println("What do you want to do?");
        System.out.println("1 - Add a car");
        System.out.println("2 - Remove a car");
        System.out.println("3 - Get information about all cars");
        System.out.println("4 - Edit information about a car");
        System.out.println("0 - Go back");
        separator();
    }
    





    public void customerCommands() {
        separator();
        System.out.println("Customer menu");
        System.out.println("What do you want to do?");
        System.out.println("1 - Choose a car");
        System.out.println("0 - Go back");
        separator();
    }
    public void choosingCriteria() {
        separator();
        System.out.println("Filter menu");
        System.out.println("Which criteria do you want to choose a car by?");
        System.out.println("1. By type of car");
        System.out.println("2. By body of car");
        System.out.println("3. By brand of car");
        System.out.println("0. Go back");
        separator();
    }
    public void choosingTypeOfCar() {
        separator();
        System.out.println("Type of car menu");
        System.out.println("Which car do you want?");
        System.out.println("1 - Passenger car");
        System.out.println("2 - Commercial car");
        System.out.println("0 - Go back");
        separator();
    }

    public void choosingBrandOfCar() {
        separator();
        System.out.println("Passenger brand menu");
        System.out.println("Which brand do you want?");
        System.out.println("1 - BMW");
        System.out.println("2 - Hyundai");
        System.out.println("3 - Mercedes");
        System.out.println("4 - Volvo");
        System.out.println("0 - Go back");
        separator();
    }

    public void choosingBodyOfCar() {
        separator();
        System.out.println("Passenger body menu");
        System.out.println("Which car body do you want?");
        System.out.println("1 - Crossover");
        System.out.println("2 - MiniVan");
        System.out.println("3 - Sedan");
        System.out.println("4 - SUV");
        System.out.println("5 - Bus");
        System.out.println("6 - Van");
        System.out.println("7 - Refrigerator");
        System.out.println("8 - Truck");
        System.out.println("0 - Go back");
        separator();
    }
}

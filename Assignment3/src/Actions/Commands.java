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
        System.out.println("3 - Get information about certain car");
        System.out.println("4 - Get information about all cars");
        System.out.println("5 - Get information about customers");
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

    public void choosingTypeOfCar() {
        separator();
        System.out.println("Type of car menu");
        System.out.println("Which car do you want?");
        System.out.println("1 - Passenger car");
        System.out.println("2 - Commercial car");
        System.out.println("0 - Go back");
        separator();
    }

    public void choosingPassengerBrandOfCar() {
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

    public void choosingCommercialBrandOfCar() {
        separator();
        System.out.println("Commercial brand menu");
        System.out.println("Which brand do you want?");
        System.out.println("1 - Hyundai");
        System.out.println("2 - Mercedes");
        System.out.println("3 - Volvo");
        System.out.println("0 - Go back");
        separator();
    }

    public void choosingPassengerBody() {
        separator();
        System.out.println("Passenger body menu");
        System.out.println("Which car body do you want?");
        System.out.println("1 - Crossover");
        System.out.println("2 - Minivan");
        System.out.println("3 - Sedan");
        System.out.println("4 - SUV");
        System.out.println("0 - Go back");
        separator();
    }

    public void choosingCommercialBody() {
        separator();
        System.out.println("Commercial body menu");
        System.out.println("Which car body do you want?");
        System.out.println("1 - Bus");
        System.out.println("2 - Van");
        System.out.println("3 - Refrigerator");
        System.out.println("3 - Truck");
        System.out.println("0 - Go back");
        separator();
    }

    public void choosingEngineCapacity() {
        separator();
        System.out.println("Engine capacity menu");
        System.out.println("Choose Capacity of Engine");
        System.out.println("1 - High");
        System.out.println("2 - Medium");
        System.out.println("3 - Low");
        System.out.println("0 - Go back");
        separator();
    }
}

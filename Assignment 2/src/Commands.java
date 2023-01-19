public class Commands {
    public void initialCommands() {
        System.out.println("####################################");
        System.out.println("Who are you?");
        System.out.println("1 - Manager");
        System.out.println("2 - Customer");
        System.out.println("0 - Exit");
        System.out.println("####################################");
    }

    public void managerCommands() {
        System.out.println("####################################");
        System.out.println("Manager menu");
        System.out.println("What do you want to do?");
        System.out.println("1 - Edit a wagon");
        System.out.println("2 - Add a wagon");
        System.out.println("3 - Remove a wagon");
        System.out.println("4 - Get information about a wagon");
        System.out.println("0 - Go back");
        System.out.println("####################################");
    }

    public void wagonEditingCommands() {
        System.out.println("####################################");
        System.out.println("Manager menu");
        System.out.println("What do you want to do?");
        System.out.println("1 - Add a passenger");
        System.out.println("2 - Remove a passenger");
        System.out.println("3 - Edit a passenger info");
        System.out.println("0 - Go back");
        System.out.println("####################################");
    }

    public void passengerInfoEditingCommands() {
        System.out.println("####################################");
        System.out.println("Manager menu");
        System.out.println("What do you want to do?");
        System.out.println("1 - Change the name");
        System.out.println("2 - Changer the surname");
        System.out.println("3 - Change the age");
        System.out.println("0 - Go back");
        System.out.println("####################################");
    }

    public void customerCommands() {
        System.out.println("####################################");
        System.out.println("Customer menu");
        System.out.println("What do you want to do?");
        System.out.println("1 - Get information about ticket");
        System.out.println("2 - Cancel ticket"); // Вводим номер билета, имя и фамилию
        System.out.println("0 - Go back");
        System.out.println("####################################");
    }
}

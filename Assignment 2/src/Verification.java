import java.util.Scanner;

public class Verification {
    private final String LOGIN = "javadev";
    private final String PASS = "javaisthebest";

    public boolean isValidManager() {
        Scanner cin = new Scanner(System.in);
        System.out.println("####################################");
        System.out.println("Enter login and password:");
        System.out.print("Login: ");
        String login = cin.nextLine();
        System.out.print("Password: ");
        String password = cin.nextLine();
        if (password.equals(PASS) && login.equals(LOGIN)) {
            System.out.println("####################################");
            return true;
        }
        System.out.println();
        System.out.println("You have entered wrong login or password");
        System.out.println("####################################");
        return false;

    }
}

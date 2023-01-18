import Wagons.Coupe;
import Wagons.ReservedSeat;
import Wagons.Wagon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Commands menu = new Commands();
        Scanner cin = new Scanner(System.in);
        ArrayList<Wagon> train = new ArrayList<>();
        for (int i = 0; i < 8; ++i) {
            train.add(new Coupe());
        }
        for (int i = 0; i < 8; ++i) {
            train.add(new ReservedSeat());
        }



        int menuNum;
        while(true) {
            menu.initialCommands();
            menuNum = cin.nextInt();
            if (menuNum == 0) {
                System.out.println("You left the menu");
                break;
            } else if (menuNum == 1) {
                Verification verification = new Verification();
                while(verification.isValidManager()) {
                    menu.managerCommands();
                    menuNum = cin.nextInt();
                    if (menuNum == 0) {
                        break;
                    } else if(menuNum == 1) {
                        while(true) {
                            menu.wagonEditingCommands();
                            menuNum = cin.nextInt();
                            if(menuNum == 0) {
                                break;
                            }
                        }
                    } else if(menuNum == 2) {

                    }
                }
            } else if (menuNum == 2) {
                menu.customerCommands();
                break;
            }
        }

    }
}
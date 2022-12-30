package recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);
        int a = cout.nextInt(), b = cout.nextInt();
        recursion(a, b);
    }
    public static void recursion(int a, int b) {
        if(a > b) {
            System.out.println(a--);
        } else if(a < b) {
            System.out.println(a++);
        } else {
            System.out.println(b);
            return;
        }
        recursion(a, b);
    }
}
package chapter2;

import java.util.Scanner;

public class andoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n >= 10000 && n <= 99999) {
            System.out.println("You entered a five-digit number.");
        } else {
            System.out.println("Not a five-digit number.");
        }
    }
}

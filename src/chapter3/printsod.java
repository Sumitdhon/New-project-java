package chapter3;

import java.util.Scanner;

public class printsod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum of digits:");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10; // Fix: Update n by dividing it by 10
        }
        System.out.println("Sum of digits: " + sum);
    }
}



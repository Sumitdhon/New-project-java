package chapter2;

import java.util.Scanner;

public class Switchcase {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                return; // Exit the program
        }

        System.out.println("Result: " + result);
    }
}

package chapter4;
import java.util.Scanner;
public class mixed { 
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
    
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                // Print alphabets
                for (int k = 0; k < i; k++) {
                    System.out.print((char) ('A' + k) + " ");
                }
                System.out.println(); // Move to the next line
            }
        }
    }
    
    


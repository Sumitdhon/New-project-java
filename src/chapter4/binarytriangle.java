package chapter4;

import java.util.Scanner;

public class binarytriangle {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
    
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j % 2 + " ");
                }
                System.out.println(); // Move to the next line


            }
        }
 }
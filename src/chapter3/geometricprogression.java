package chapter3;

import java.util.Scanner;

public class geometricprogression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n=sc.nextInt();
        int a=1;
        for (int i =1; i<=n; i++) {
            System.out.println(a);
            a*=2;
            
        }
    }
    
}

package chapter3;

import java.util.Scanner;

public class Sop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        int sum=0;
        int on=n;
        while(n!=0){
            int digit =n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println("Sop" +on+ " = " +sum);
    }
    
}

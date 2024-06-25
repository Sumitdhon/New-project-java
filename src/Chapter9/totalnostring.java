package Chapter9;

import java.util.Scanner;

public class totalnostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number :");
       int n = sc.nextInt();
        // Long n =sc.nextLong();
        // String s = Integer.toString(n);
        String s = Long.toString(n);
        System.out.println(s);   
        System.out.println(s.length());
    
    }
    
}

package chapter1;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int x=sc.nextInt();
        double y=sc.nextDouble();
        //double y= (double) x;
        int x=(int)y;
        System.out.println(x);
    }
    
}

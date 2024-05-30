package chapter3;

import java.util.Scanner;

public class ap3 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //1,4,7,10,13,16....
        for(int i=1;i<=3*n-1;i+=3)
        System.out.println(i);
    }
    
}

    

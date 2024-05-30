package chapter4;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and coloumn :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //for(int j=1;j<=i;j++)
             for(int j=1;j<=i;j++)
            {
                System.out.print(" "+" ");
                //System.out.print((char)(j+96)+" ");
            } 
            System.out.println();
        }
    }
    
}

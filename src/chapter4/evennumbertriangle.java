package chapter4;

import java.util.Scanner;

public class evennumbertriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=2*i-1;j+=2){
               // System.out.print(j + " ");
               System.out.print(a+" ");
               a +=2;
            }
            System.out.println();
        }
    }
    
}

    
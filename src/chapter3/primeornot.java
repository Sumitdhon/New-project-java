package chapter3;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int x=0; //o means prime
        for(int i=2;i<=n-1;i++){
            if(n%1==0){
                // i is a factor of n
                System.out.println("composite number :");
                x=1; //1 means composite 
                break;
            }
        }
        if(x==0)
        System.out.println("prime number :");
    }
    
}

package chapter3;

import java.util.Scanner;

public class tableofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer n:");
        int n=sc.nextInt();
        System.out.println("Multiplication table for " + " n+");
        for(int i=1;i<=10;i++ ){
            int result=n*1;
            System.out.println(n+"*"+i+"="+result);
        }
        }
    }    
    


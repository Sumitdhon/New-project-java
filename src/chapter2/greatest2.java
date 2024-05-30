package chapter2;

import java.util.Scanner;

public class greatest2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a greatest number :");
        int a =sc.nextInt();
        System.out.println("enter 2nd greatest number :");
        int b=sc.nextInt();
        System.out.println("enter 3rd greatest number :");
        int c=sc.nextInt();
        if(a>b){
            if(a>c)
            System.out.println(a+" is greatest :");
            else //c>=a>b
            System.out.println(c+" is greatest :");
        }
        else{ //b>=a
        if(b>c)
        System.out.println(b+" is greatest :");
        else //c>=b>=a
        System.out.println(c+" is greatest :");
    }   

}
}  

    


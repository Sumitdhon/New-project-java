package chapter1;

import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch=sc.next().charAt(0);
        int x=(int)ch;
        System.out.println(x);
    }
    
}

package chapter6;

import java.util.Arrays;

import chapter1.nextline;

public class zerosAndonesmethod1 {
    public static void main(String[] args) {
        int [] arr={1,0,0,0,1,1,1,0,0,1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");

            
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]+" ");
            
        }

        
    }
    
}

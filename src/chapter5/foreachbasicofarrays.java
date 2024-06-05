package chapter5;

import java.util.Arrays;

public class foreachbasicofarrays {
    public static void main(String[] args) {
        int []arr={10,20,30,45,02,65,95};
        for (int ele : arr){
            System.out.println(ele+" ");
        
        }
        Arrays.sort(arr);
        System.out.println(); 
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
    }
    
}



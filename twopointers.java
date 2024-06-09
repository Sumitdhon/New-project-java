package chapter6;

import java.util.Arrays;

public class twopointers {
    public static void main(String[] args) {
     int[] arr={10,20,30,40,0,45};
     int n=arr.length;
     for(int ele:arr){
        System.out.print(ele+" ");
     
    }
    System.out.println();
   // Reverse
   for (int i = 0; i < n / 2; i++) {
    int j = n - 1 - i;
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp; // Corrected this line
  }

  // Print the reversed array
   for (int ele : arr) {
    System.out.print(ele + " ");
   }
}} 

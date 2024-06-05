package chapter5;

import java.util.Arrays;

public class copyofArrays{
        
    public static void main(String[] args) {
        int []arr={10,20,30,45,02,65,95};
        for (int ele : arr){
            System.out.println(ele+" ");
        
        }
        System.out.println();
        // int x=4;
        //int y=x;
        int[] nums=arr; //shallow copy
        nums[0]=70;
        System.out.println(arr[0]);
       // for (int ele : nums){ 2nd method using foreach loop
        //System.out.println(ele+" ");
       // for (int i = 0; i < nums.length; i++) {
        //   System.out.println(nums[i]+" ");
            
        
        
    }
}                
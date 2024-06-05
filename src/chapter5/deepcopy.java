package chapter5;

import java.util.Arrays;

public class deepcopy {
    public static void main(String[] args) {
        int []arr={10,20,30,45,02,65,95};
        for (int ele : arr){
            System.out.println(ele+" ");
        
        }
        System.out.println();
        
        int[] nums=arr; //
        nums[0]=70;
        System.out.println(nums[0]);
        int[]brr=Arrays.copyOf(arr, arr.length);
       // for(int ele : brr){
        //   System.out.println(ele+" ");
        //brr[0]=70;
        //System.out.println(arr[0]); 
        
        
        
        int[]crr=new int[arr.length];
        for (int i = 0; i < crr.length; i++) {
            crr[i]=arr[i];
        }
            crr[0]=100;
            System.out.println(arr[0]);
    }
    
}

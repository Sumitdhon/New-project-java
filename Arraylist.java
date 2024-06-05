package chapter5;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //int[]arr={10,20,30,40,45};
        //double[]brr={1.5,2.5,25.3,33.2};
        ArrayList<Integer>arr=new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,120);
        arr.add(2,20);
        arr.add(3,23);
        arr.add(4,43);
        arr.add(5,25);
      // System.out.println(arr);
        for(int i=0;i<=5;i++){
        System.out.println(arr.get(i)+" "); //arr[i];
        }
        System.out.println();
        arr.set(2, 123); //modify
        for(int i=0;i<=5;i++){
        System.out.println(arr.get(i)+" ");
        }

    }
    
}

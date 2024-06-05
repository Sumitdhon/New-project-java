package chapter5;

import java.util.ArrayList;

public class ListinArrays {
     public static void main(String[] args) {
        
        ArrayList<Integer> list =new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(60);
        System.out.println(list+" "+list.size());
        list.add(50);
        System.out.println(list+" "+list.size());
        list.add(205);
        System.out.println(list+" "+list.size());
        list.add(-45);
        System.out.println(list+" "+list.size());
        list.remove(1);
        System.out.println(list+" "+list.size());

    }
}

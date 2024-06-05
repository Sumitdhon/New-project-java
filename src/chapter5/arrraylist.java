package chapter5;
import java.util.ArrayList;
public class arrraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr =new ArrayList<>(6);
        arr.add(0,15); //arr[0]=10;
        arr.add(1,25); //intialize 
        arr.add(2,115);
        arr.add(3,10);
        arr.add(4,151);
        arr.add(5,215);

        System.out.println(arr.size());
        
        //System.out.println(arr);
        
        
        for(int i=0;i<=5;i++){
        System.out.print(arr.get(i)+" ");
        }

        System.out.println();

        
        
        arr.set(2, 241); //modify
       // for(int i=0;i<6;i++)
        for(int i=0;i<arr.size();i++){
        
            System.out.print(arr.get(i)+" ");
        }
        arr.add(98);
       // System.out.print(arr.size());
        System.out.println();
        System.out.print(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");

        }



        


    }
    
}

package chapter5;
import java.util.Scanner;

public class intializationofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //input->loop
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();

        }
        //output->loop
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
   
}



/*class intializationofarray{
    public static void main(String[] args){
        int []arr={10,20,30,301,404};
        System.out.println(arr[0]+" ");
         for(int i=0;i<=8;i++){
            System.out.print(arr[i] +" ");
        }
    }


}*/
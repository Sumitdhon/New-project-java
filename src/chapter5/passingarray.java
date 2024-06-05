package chapter5;

public class passingarray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        //int x=5;
        System.out.println(arr);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int []arr) {
        arr[0]=90;
        
    }
    
}

package chapter8;

public class arraysofarray {
    public static void main(String[] args) {
        int[] a={4,7,2,0};
        for(int ele : a){
            System.out.print(ele + " ");
        }
        System.out.println();
        //1 2 3 
        //4 5 6
        int[][] b = {{1,2,3} ,{5,6,4} };
        for(int[] ele : b){
            for(int x: ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    
}

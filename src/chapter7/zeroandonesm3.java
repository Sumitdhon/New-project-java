package chapter7;

public class zeroandonesm3 {
    public static void main(String[] args) {
       int[] arr={1,0,0,1,1,0,0,0,1,0};
        // int []arr={1,0,0,1,1};
        int n=arr.length;
        int noOfZeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeros++;

        }
        for(int i=0;i<n;i++){
            if(i<noOfZeros) arr[i]=0;
            else arr[i]=1;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
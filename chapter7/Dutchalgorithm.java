package chapter7;

public class Dutchalgorithm {
    public static void main(String[] args) {
        //method 1

        int[] arr={0,1,2,0,1,2,1,2,0,0};

        int n=arr.length;
        
        int noOfzeroes=0;
        
        int noOfones=0;
        
        for(int i=0;i<n;i++){
        
            if(arr[i]==0) noOfzeroes++;
        
            if(arr[i]==1) noOfones++;
        }for(int i=0;i<n;i++){
            if(i<noOfzeroes) arr[i]=0;
           else if(i<noOfzeroes+noOfones) arr[i]=1;
           else arr[i]=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

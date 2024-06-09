package chapter6 ;

public class ArraysSumdouble {
     public static void main(String[] args) {
        int[] arr ={4,3,1,0,5,2,6};
        int x=9;
        int n=arr.length;
        //solution
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                    //break;
                }
            }

        }

    }
    
}

    


    

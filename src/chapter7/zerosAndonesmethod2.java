package chapter7;
public class zerosAndonesmethod2  {
    public static void main(String[] args) {
        //int[] arr = {1, 0, 0, 0, 1, 1, 1, 0, 0, 1};
        int []arr={1,0,0,1,1};
        int n = arr.length;
        int noOfzeroes = 0;
        /*method 2

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                noOfzeroes++;
        }
        for (int i = 0; i < n; i++) {
            if (i < noOfzeroes)
                arr[i] = 0;
            else
                arr[i] = 1;
        }

        // Print the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
      */
     int i=0;
     int j=n-1;
     while (i<j) {
         if(arr[i]==0) i++;
         if(arr[j]==1) j--;
         if(arr[i]==1 && arr[j]==0){
            arr[i]=0;
            arr[j]=1;
            i++;
            j--;
        }
    }
    for(int ele: arr){
        System.out.print(ele+" ");

    }
    System.out.println();
        
}
}

    
   

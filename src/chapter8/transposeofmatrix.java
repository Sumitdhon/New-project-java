package chapter8;

public class transposeofmatrix {
    public static void main(String[] args) {
        //1 2 
        //5 6 
        //9 8 
        //row wise & coloumn wise printing
        int[][] arr={{1,2},{5,6},{9,8}};
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.print(arr[i][j]+" ");
                
            }
            
            //col. wise printing
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.println(arr[i][j]+" ");
            }
            
        }    
        System.out.println();

        
        
    }
    
}

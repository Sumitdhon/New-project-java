package chapter8;

public class transposeinnewmatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2},{5,6},{9,8}};
        int m=arr.length;
        int n=arr[0].length;
       
                //System.out.print(arr[i][j]+" ");
            
            System.out.println();
            int[][] transpose=new int[n][m];
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j]=arr[j][i];
                System.out.println(transpose[i][j]+" ");
        
            }
        }
        System.out.println();          


    }
    
}

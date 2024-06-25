package chapter8;

public class addtwomatrix {
    public static void main(String[] args) {
        int[][] a={{1,9,2},{2,5,4},{9,5,7}};
        int[][] b={{1,2,4},{5,-9,3},{5,10,3}};
        int m=a.length;
        int n=b[0].length;
        int [][] res=new int[m][n]; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j]=a[i][j] + b[i][j];

                
            }
            
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
           } 
           System.out.println();
        } 


    }

    
}

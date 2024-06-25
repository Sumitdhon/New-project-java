package chapter8;

import java.util.Scanner;

public class lengthop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[2][3];
        int m=arr.length; // no fo rows 
        int n=arr.length; // no of coloumns
        System.out.println(n);

        for(int i=0;i<m;i++){   //rows
            for(int j=0;j<n;j++){   //Coloumns
                arr[i][j]=sc.nextInt();
            }    
        }    
        for(int i=0;i<m;i++){   //rows
            for(int j=0;j<n;j++){   //Coloumns
                System.out.print(arr[i][j]+" ");
        
            }
            System.out.println();
        }        

    }
    
}

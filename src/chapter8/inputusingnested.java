package chapter8;

import java.util.Scanner;

public class inputusingnested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[2][3];

        //Input of 2D array

        for(int i=0;i<2;i++){   //rows
            for(int j=0;j<3;j++){   //Coloumns
                arr[i][j]=sc.nextInt();
            }    
        }    
        for(int i=0;i<2;i++){   //rows
            for(int j=0;j<3;j++){   //Coloumns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }    

    }
        

}

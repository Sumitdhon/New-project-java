package chapter4;

import java.util.Scanner;

public class reversenumbertriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.println(j+" ");
                //System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
    
}

package chapter8;

public class coeff {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;


        }
        return f;
    }
    public static int binCoeff(int  n, int r){
        int fact_n= factorial(n);

        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    // func to calc  sum of 2 numbers
    // public static int sum(int a, int b){

    //     return a+b;

    // }
    // func to calc  sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a + b + c;


    }
    // func to calc  int sum
    public static int sum(int a, int b){

        return a+b;

    }
    //func to call float sum
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.54f,45.25f));
    }
}

    


package chapter6;

public class booleanp {
    public static void main(String[] args) {
        int x = 121; // Example value for x

        boolean isPalindrome = isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        
        while(org > 0){
            int unit = org%10;
            rev = 10*rev+unit;
            org/=10;
        }
        
        return rev == x;
    }
}
    

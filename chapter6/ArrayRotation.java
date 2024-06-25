package chapter6;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 0, 45};
        
        int k = 7; // Example value for k (can be any non-negative integer)

        int n = a.length;
        int effectiveRotation = k % n;

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = a[(i + n - effectiveRotation) % n];
        }

        // Print the rotated array
        for (int ele : rotated) {
            System.out.print(ele + " ");
        }
    }
}

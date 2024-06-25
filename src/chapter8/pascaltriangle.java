package chapter8;

import java.util.ArrayList;
import java.util.List;
public class pascaltriangle {
    public static void main(String[] args) {
        int numRows = 5; // Change this to adjust the number of rows in the triangle
        ArrayList<ArrayList<Integer>> triangle = generatePascalTriangle(numRows);

        // Print the Pascal's triangle
        for (ArrayList<Integer> row : triangle) {
            for (Integer number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generatePascalTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle; // Return empty triangle for invalid input
        }

        // Generate first row
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate subsequent rows
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> prevRow = triangle.get(i - 1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1); // First element in each row is always 1

            // Calculate middle elements based on previous row
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1); // Last element in each row is always 1
            triangle.add(row);
        }

        return triangle;
    }
}

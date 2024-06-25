package chapter8;

import java.util.ArrayList;
import java.util.List;

public class searchaTwodarrays {

    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        int m = arr.length;     // Number of rows
        int n = arr[0].length;  // Number of columns

        // Flatten the 2D array into a 1D list
        List<Integer> flattened = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flattened.add(arr[i][j]);
            }
        }

        // Calculate the effective shift (k modulo size of flattened array)
        k = k % flattened.size();

        // Rotate the flattened list to the right by k positions
        List<Integer> rotated = new ArrayList<>();
        for (int i = flattened.size() - k; i < flattened.size(); i++) {
            rotated.add(flattened.get(i));
        }
        for (int i = 0; i < flattened.size() - k; i++) {
            rotated.add(flattened.get(i));
        }

        // Convert the rotated list back to a 2D grid
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(rotated.get(index));
                index++;
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;

        searchaTwodarrays solution = new searchaTwodarrays();
        List<List<Integer>> shiftedGrid = solution.shiftGrid(arr, k);

        // Print the shifted grid
        for (List<Integer> row : shiftedGrid) {
            System.out.println(row);
        }
    }
}

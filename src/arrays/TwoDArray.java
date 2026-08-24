package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            2D Array Declaration:
            int[][] arr = new int[rows][columns];
            - Number of rows is mandatory: int[3][] is valid.
            - Number of columns is optional (columns can have varying lengths - Jagged Array).
        */
        int[][] arr = new int[3][3];

        // 1. Taking Input for 2D Array
        System.out.println("Enter elements for a 3x3 matrix (9 integers):");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // 2. Output Method 1: Using nested for loops
        System.out.println("\n--- Output using nested for loop ---");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // 3. Output Method 2: Using enhanced for-each loop and Arrays.toString()
        System.out.println("\n--- Output using for-each + Arrays.toString() ---");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        // 4. Output Method 3: Using Arrays.deepToString()
        System.out.println("\n--- Output using Arrays.deepToString() ---");
        System.out.println(Arrays.deepToString(arr));

        // 5. Example of a Jagged Array (Variable Column Lengths)
        System.out.println("\n--- Jagged Array Example ---");
        int[][] jaggedArr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        for (int[] row : jaggedArr) {
            System.out.println(Arrays.toString(row));
        }
    }
}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            =======================================================
            17. MultiDimension / 2D Array (From javaNotes.md)
            =======================================================
            Visualization:
                1 2 3
                4 5 6
                7 8 9

            Rules:
            1. Number of rows is FIRST and MANDATORY while declaring:
                int[][] arr = new int[3][]; // Valid
            2. Number of columns is SECOND and NOT mandatory to specify (allows Jagged Arrays).

            Length Properties:
            - arr.length       -> Gives number of ROWS
            - arr[row].length  -> Gives number of COLUMNS in that specific row

            Printing Methods from Notes:
            - Arrays.toString(arr[row]): Loop through array and print each row (1D array) for a clean grid format.
            - Arrays.deepToString(arr): Converts the entire 2D array to a single string representation.
        */

        // 18. Input / Output in 2D Array
        int[][] arr = new int[3][3];

        // Taking Input
        System.out.println("Enter elements for 3x3 matrix (9 integers):");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Output Method 1: Printing each element one by one using nested for loops
        System.out.println("\n--- 1. Printing element by element ---");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Output Method 2: Printing whole row with Arrays.toString() inside standard loop
        System.out.println("\n--- 2. Printing row by row with Arrays.toString(arr[row]) ---");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Output Method 3: Using enhanced for-each loop row by row
        System.out.println("\n--- 3. Printing using enhanced for-each loop ---");
        for (int[] sarr : arr) {
            // print the 2d array row by row
            System.out.println(Arrays.toString(sarr));
        }

        // Output Method 4: Directly print whole 2d array in one line
        System.out.println("\n--- 4. Directly printing whole 2D array with Arrays.deepToString() ---");
        System.out.println(Arrays.deepToString(arr));

        // Jagged Array (Varying column sizes) from notes
        System.out.println("\n--- Jagged Array Example ---");
        int[][] jaggedArray = {
                {1, 2, 4},
                {2, 5},
                {1, 7, 2, 6}
        };

        for (int[] row : jaggedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

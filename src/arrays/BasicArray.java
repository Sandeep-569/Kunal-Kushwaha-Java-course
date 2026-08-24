package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            =======================================================
            16. Array & Memory Management (From javaNotes.md)
            =======================================================
            Syntax:
                datatype[] variableName = new datatype[size];

            - 'new' is used to create an object in the heap memory.
            - Array can only contain data of the same type:
                int[] -> contains only integers
                String[] -> contains only strings

            Memory Concept:
            1. Declaration:
                int[] ros;
                -> 'ros' reference variable gets defined in the STACK memory (at compile time).
            2. Initialization:
                ros = new int[5];
                -> The actual array object is created in the HEAP memory (dynamic memory allocation at runtime).

            Direct initialization:
                int[] rnos2 = {23, 34, 43, 23, 54};
        */

        // Declaration & Initialization
        int[] ros = new int[5]; // Stores 5 integers

        // Input using Scanner
        System.out.println("Enter 5 numbers for the array (ros):");
        for (int i = 0; i < ros.length; i++) {
            ros[i] = in.nextInt();
        }

        // Output Method 1: Using standard for loop with index
        System.out.println("\n--- Output using standard for loop ---");
        for (int i = 0; i < ros.length; i++) {
            System.out.print(ros[i] + " ");
        }
        System.out.println();

        // Output Method 2: Using enhanced for-each loop
        System.out.println("\n--- Output using for-each loop ---");
        for (int n : ros) { // 'n' represents every element of the array
            System.out.print(n + " ");
        }
        System.out.println();

        // Output Method 3: Using Arrays.toString()
        System.out.println("\n--- Output using Arrays.toString() ---");
        System.out.println(Arrays.toString(ros));

        // Array of Strings
        System.out.println("\nEnter 3 words for String array:");
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println("String Array: " + Arrays.toString(str));
    }
}

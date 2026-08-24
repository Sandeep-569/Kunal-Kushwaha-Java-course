package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Array declaration & memory allocation
        // Syntax: datatype[] variableName = new datatype[size];
        int[] arr = new int[5];

        // 2. Taking Input from user
        System.out.println("Enter 5 integers for 1D Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // 3. Output Method 1: Using standard for loop
        System.out.println("\n--- Output using standard for loop ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. Output Method 2: Using enhanced for-each loop
        System.out.println("\n--- Output using for-each loop ---");
        for (int num : arr) { // num represents each element of the array
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Output Method 3: Using Arrays.toString()
        System.out.println("\n--- Output using Arrays.toString() ---");
        System.out.println(Arrays.toString(arr));

        // Array of Objects / Strings example
        System.out.println("\nEnter 3 strings:");
        String[] strArr = new String[3];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = in.next();
        }
        System.out.println("String Array: " + Arrays.toString(strArr));
    }
}

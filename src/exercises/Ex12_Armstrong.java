package exercises;

import java.util.Scanner;

public class Ex12_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int n = num;

        while(n != 0){
            int temp = n % 10;
            sum = sum + (temp * temp * temp);
            n /= 10;
        }

        if (sum == num) {
            System.out.println(true + " - It is an Armstrong number.");
        } else {
            System.out.println(false + " - It is not an Armstrong number.");
        }

        sc.close(); // It's good practice to close the scanner
    }
}

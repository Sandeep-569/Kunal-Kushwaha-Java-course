package exercises;

import java.util.Scanner;

public class Ex02_CountingRepeatingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int count=0;
        while(n !=0 ){
           int temp = n%10;
           if(temp==r){count++;}
           n/=10;
        }
        System.out.println(count);
    }
}

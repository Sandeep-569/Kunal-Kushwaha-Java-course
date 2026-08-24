package basicquestions;

import java.util.Scanner;

public class Ex05_FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,b=1;
        //by while loop
        int count = 2;
        while(count<=n){
            int temp = a+b;
            a=b;
            b=temp;
            count++;
        }
        //by for loop
//        for(int i = 1;i<n;i++){
//           int p=a+b;
//           a=b;
//           b=p;
//        }
        System.out.println(b);
    }
}


package basicquestions;

import java.util.*;
public class Ex06_ReverseTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 2147483643,ans=0;
        while(n!=0){
            int temp = n%10;
            ans = ans * 10 + temp;
            n/=10;
        }
        System.out.println(ans);
        sc.close();
    }
}


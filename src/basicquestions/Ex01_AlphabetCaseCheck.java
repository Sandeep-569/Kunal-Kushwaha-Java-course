package basicquestions;

import java.util.Scanner;

public class Ex01_AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
//        String word = "hello";
//        System.out.println(word.charAt(0)); // this will print the character at 0 index which is h
        if(ch>='a' && ch<='z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }
    }
}

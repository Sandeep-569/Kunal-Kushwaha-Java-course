package string;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String str = "Sandeep Saha";
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("s"));
        System.out.println(str);
        System.out.println("    san deep    ".strip());
        System.out.println(Arrays.toString(str.split("d")));
    }
}

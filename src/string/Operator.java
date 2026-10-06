package string;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//196
        System.out.println("a" + "b");//ab
        System.out.println((char)('a' + 3));//d

        System.out.println("a" + 1);//a1
        //this is same as after a few steps: "a" + "1"
        //integer will be converted to Integer(wrapper class
        // that will call toString()

        System.out.println("sandeep" + new ArrayList<>());//sandeep[]
        System.out.println("sandeep" + new Integer(56));//sandeep56
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
        // to print different object one of them should be string
    }
}

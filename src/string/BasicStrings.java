package string;

public class BasicStrings {
    public static void main(String[] args) {
        String a = "sandeep";
        String b = "sandeep";
        String c = new String("sandeep");

        System.out.println(b==a); // true
        //pointing to same object
        //here it used the same data to assign the b

        System.out.println(b==c); // false
        // here we created the new string using new

        System.out.println(b.equals(c));//true

        System.out.println(a.charAt(0));

    }
}

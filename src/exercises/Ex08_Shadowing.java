package exercises;

public class Ex08_Shadowing {
    static int x =90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x; // declaring x again  will shadow the class variable in line 2
        // we have declared the variable over here
        //System.out.println(x); // this will throw the error that
        x=80;// we have initialized the variable over here
        System.out.println(x);//80
        fun();
    }
    static void fun(){
        System.out.println(x);//90
    }
}

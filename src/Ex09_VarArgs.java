import java.util.Arrays;

public class Ex09_VarArgs {
    public static void main(String[] args) {
    fun(2,23,23,23,23434134,134,23,213);

    multiple(2,3,"serf","sefg","sefg");
    }

    static void multiple(int a,int b,String ...v){
        System.out.println(a+b+" " + Arrays.toString(v));
    }

    static void fun(int ...v){ //this will create an array
        System.out.println(Arrays.toString(v));
    }
}

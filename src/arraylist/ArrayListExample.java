package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(2);
        list.add(3);
        list.add(21);

        System.out.println(list.contains(2));
        System.out.println(list.contains(23));
        System.out.println(list);
        list.add(1, 33);
        list.set(2,6);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
            //list[index] will not work here
        }
    }
}

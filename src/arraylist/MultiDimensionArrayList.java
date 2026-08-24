package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for(int i=0;i<5;i++){
            list.add(new ArrayList<>()); // set the array list
        }

        // add elements
        for(int i=0;i<5;i++){ // select each array list
            for(int j=0;j<3;j++){ // set each element in that
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        sc.close();
    }
}

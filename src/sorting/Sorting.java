package sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        boolean swapped;
        int n = arr.length;
        //run the loop for n -1 times as after that it will be sorted 
        for(int i =0;i<n-1;i++){
            swapped = false;
            //for each loop, max item will come at the last respective index
            for(int j =1;j<n-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    swapped=true;
                }
            }
            // if you did not swap for a particular value of i ,
            // it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}

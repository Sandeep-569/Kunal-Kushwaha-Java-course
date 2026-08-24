package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] rev2 = {6,5,4,3,2,1};
        // If your reverse methods returned void (no return statement),
        // that single line wouldn't work. You would be forced to write it in two separate steps:
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverse2(rev2)));
        // reverse(arr);                              1. Reverse the array in-place
        //System.out.println(Arrays.toString(arr));   2. Print the updated array
    }
    static int[] reverse(int[] arr){
        int end = arr.length -1;
        for(int i = 0;i<end;i++){
            int temp = arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;
        }
        return arr;
    }
    // using swap function
    static int[] reverse2(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    //swap function

    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

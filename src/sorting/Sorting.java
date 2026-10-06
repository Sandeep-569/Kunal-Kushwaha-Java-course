package sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {-5,8,3,8,3,9,0,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    //first we take first two elements and check if its is in increasing order or not
    //if not then we swap then same first 3 elements and first 4 elements
    //now how would we swap them,
    //swapping will put larger number to end and if the end elements is larger than previous
    // that means it already sorted before by the same code, here we use break
    //we start comparing from last and go to front which arrange our code in increasing order
    static void insertion(int[] arr){
        //stable
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
    }

    static void bubble(int[] arr){
        boolean swapped;
        int n = arr.length;
        //run the loop for n -1 times as after that it will be sorted 
        for(int i =0;i<n-1;i++){
            swapped = false;
            //for each loop, max item will come at the last respective index
            for(int j =1;j<n-i;j++){
                //we know that the last element is sorted that why we use n -i
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

    static void selection(int[] arr){
        for(int i =0;i<arr.length;i++){
            // find the maximum element and swap it with the last index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        // max can be at the start index
        int max = start;
        // here i<=end because end(last) is already the perfect range
        for(int i =start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

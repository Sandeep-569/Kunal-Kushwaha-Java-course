package binarysearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-1,0,1,2,3,43,55,56,88,99,100};
        int target = 1001;
        System.out.println(bSearch(arr,target));
    }

    //Return the index
    static int bSearch(int[] arr,int target){
        int start =0;
        int end = arr.length-1;


        while(start<=end){
            //find the middle element
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if( target < arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

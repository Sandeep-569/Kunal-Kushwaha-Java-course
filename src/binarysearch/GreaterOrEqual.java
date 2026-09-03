package binarysearch;

public class GreaterOrEqual {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 11;
        int start =0;
        int end = arr.length-1;
        int ans =0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(arr[start]);
    }
}
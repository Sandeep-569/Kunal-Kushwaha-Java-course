package arrays;

public class MaxArrayElement {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,99};
        System.out.println(max(arr));
        System.out.println(rangemax(arr,1,4));

    }
    //max element in whole array
    static int max(int[] arr){
        int max =0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
    //max element in range of array
    static int rangemax(int[] arr,int start,int end){
        if (start > end) {
            return -1;
        }
        if(start == end){
            return arr[start];
        }
        int rmax =0;
        for (int j=start;j<=end;j++) {
            if (rmax < arr[j]) {
                rmax = arr[j];
            }
        }
        return rmax;
    }
}

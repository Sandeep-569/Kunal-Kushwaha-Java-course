package binarysearch;

public class CeilingOfaNumber {//ceiling mean greater then equal to target
    public static void main(String[] args){
        int[] arr = {2,4,5,9,14,16,18};
        int target = 3;
        System.out.println(find(arr,target));
    }
    static int find(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid +  1;

            }
//            else{
//                return mid;
//            }
        }
//        return end+1;
//        return start;
//        return arr[start];
        // ceiling

        //floor
        return arr[end];
    }
}

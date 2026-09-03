package binarysearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    static int splitArray(int[] nums,int m){
        int start = 0;
        int end = 0;

        for(int i =0;i< nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        //binary search
        while(start<end){
            //try for the middle as potential ans
            int mid = start + (end-start)/2;

            //cal how many pieces you can divide this in with this max sum

        }
        return end;//here start == end
    }

}

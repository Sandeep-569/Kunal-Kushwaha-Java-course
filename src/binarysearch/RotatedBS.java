package binarysearch;

public class RotatedBS {
    public static void main(String[] args) {
        int[] nums ={2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));

    }

    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                //start= mid;
                // if this was there then it will be caught
                // in case 1 and case 2
                start = mid +1;
            }
//            //here we are checking if this have duplicate
//            //if elements at start,middle,end are equal
//            // then just skip the duplicates
//            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
//                //before skipping check if start is pivot
//                if(arr[start]>arr[start+1]){
//                    return start;
//                }
//                start++;
//                //before skipping check if end is pivot
//                if(arr[end]<arr[end-1]){
//                    return end-1;
//                }
//                end--;
//            }
//            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
//                start = mid +1;
//            }else{
//                end = mid -1;
//            }
        }
        return -1;
    }

    static int search(int[] nums,int target){
        int pivot = findPivot(nums);
        if (pivot == -1){
            // this mean the array was not rotated
            return bSearch(nums,target,0,nums.length-1);
        }
        //if pivot is found we have found 2 asc soreted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        else if(target>=nums[0]){
            return bSearch(nums,target,0,pivot-1);
        }else{
            return bSearch(nums,target,pivot+1,nums.length-1);
        }
    }
    static int bSearch(int[] arr,int target,int start,int end){

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

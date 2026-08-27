package binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int target = 1;

        System.out.println(OrderABS(arr,target));
        System.out.println(OrderABS(arr2,target));
    }

    static int OrderABS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }


        }
        return -1;
    }
}
package exercises;

//public class Ex07_SwapNumber {
//    public static void main(String[] args) {
//        int a=20,b=30;
//        swap(a,b);
//
//        System.out.println(a + " " + b);
//
//    }
//    static void swap(int a, int b) {
//        int temp =a;
//        a=b;
//        b= temp;
//    }
//} // this is not work as primitive data type is pass by value
// when u assign the variable it will create a new place heap
//It doesn't work because primitive data types are passed by value.
// Java just passes a pure copy of the number.
public class Ex07_SwapNumber {
    public static void main(String[] args) {
        // Wrap the primitives in an array (an object)
        int[] nums = {20, 30};

        swap(nums);

        System.out.println(nums[0] + " " + nums[1]); // Prints: 30 20
    }

    static void swap(int[] arr) {
        // Use the copied object reference to mutate the array on the Heap
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
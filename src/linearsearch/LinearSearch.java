package linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        System.out.println(search(numbers, target));
        System.out.println(search2(numbers, target));
        System.out.println(search3(numbers, target));
        System.out.println(range(numbers,target,4,9));

    }
    //find the target and return the index
    static int search(int[] numbers, int target) {
        if (numbers.length == 0) {
            return -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        // this will execute when target not found
        return -1;
    }
    //find the target and return the true or false
    static boolean search2(int[] numbers, int target) {
        if (numbers.length == 0) {
            return false;
        }
        for (int number : numbers) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }
    //find the target and return the element
    static int search3(int[] numbers, int target) {
        if (numbers.length == 0) {
            return -1;
        }
        for (int number : numbers) {
            if (number == target) {
                return number;
            }
        }
        return -1;
    }
    //find the target in the range and return the index
    static int range(int[] numbers,int target ,int start ,int end){
        if(numbers.length==0){
            return -1;
        }
        for(int i = start;i<end;i++){
            if(target==numbers[i]){
                return i;
            }
        }
        return -1;
    }
}

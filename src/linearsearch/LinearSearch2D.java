package linearsearch;

import java.util.Arrays;

public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 56;
        int[] ans = search2(arr,target);//format to return the value of the row,col in array
        System.out.println(search(arr,target));
        System.out.println(Arrays.toString(ans));
        //direct way
        // System.out.println(Arrays.toString(search2(arr,target)));
    }
    static boolean search(int[][] array,int target){
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (target == anInt) {
                    return true;
                }
            }
        }
        return false;
    }
    static int[] search2(int[][] array,int target){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(target == array[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

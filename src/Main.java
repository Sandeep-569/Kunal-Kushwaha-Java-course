import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,-6};
        int target = -5;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int[] ans = {-1,-1};

        for(int i = n-1;i>=0;i--){
            for(int j =n-1;j>=0;j--){
                if(nums[i] + nums[j]==target && nums[i] > nums[j] ){
                    if(max<nums[i] * nums[j]){
                        max = nums[i] * nums[j];
                        ans[0] = i;
                        ans[1] =j;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
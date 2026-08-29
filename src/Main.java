
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        int n = nums.length;
        int min = nums[2];
        int max =0;
        for(int i : nums){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
        int r =1;
        while(r!=0){
            r=max%min;
            max=min;
            min=r;
        }
        System.out.println(max);
    }
}
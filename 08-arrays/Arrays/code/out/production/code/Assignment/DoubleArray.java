package Assignment;

import java.util.Arrays;

public class DoubleArray {
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];

        for (int i=0;i<nums.length;i++){
            ans[i] = nums[i];               // First half
            ans[i + nums.length] = nums[i]; // Second half
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.print(Arrays.toString(ans));
    }
}
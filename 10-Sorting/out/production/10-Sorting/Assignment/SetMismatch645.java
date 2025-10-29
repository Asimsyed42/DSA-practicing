package Assignment;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int [] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int [] findErrorNums(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums, i , correct);
            }else{
                i++;
            }
        }
        int [] ans = new int[2];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans[0]=nums[index];
                ans [1] = index+1;
            }
        }
        return ans ;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

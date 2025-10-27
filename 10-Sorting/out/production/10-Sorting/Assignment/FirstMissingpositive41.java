package Assignment;

import java.util.Arrays;

public class FirstMissingpositive41 {
    public static void main(String[] args) {
        int[] nums ={-1,2,1,3,4};
        int ans = missingPositiveNumber(nums);
        System.out.println(ans);
    }
    static int missingPositiveNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if (nums [i] > 0 && nums[i] < nums.length && nums[i]!=nums[correct]){
                swap(nums, i , correct );
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        //searching for element
        for (int j = 0; j < nums.length;j++) {
            if (nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

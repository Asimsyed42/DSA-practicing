package assignment;

//https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/1896240277/?envType=problem-list-v2&envId=array
//1389. Create Target Array in the Given Order

public class CreateTargetArrayTheGivenOrder {
    static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] ans = createTargetArray(nums, index);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[]ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for (int j = nums.length - 1; j > index[i]; j--) {
                ans[j] = ans[j - 1];
            }
            ans[index[i]] = nums[i];
        }
        return ans;
    }
}

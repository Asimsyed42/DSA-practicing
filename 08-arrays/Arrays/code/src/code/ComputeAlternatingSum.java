package assignment;

//https://leetcode.com/problems/compute-alternating-sum/description/
//3701. Compute Alternating Sum

public class ComputeAlternatingSum {
    static void main(String[] args) {
        int[]nums={1,3,5,7};
        System.out.println(alternatingSum(nums));
    }
    static int alternatingSum(int[] nums) {
        int count=0;
        for(int i=0;i< nums.length;i++){
            if(i%2==0){
                count+=nums[i];
            }else{
                count-=nums[i];
            }
        }
        return count;
    }
}

package assignment;

//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/
//2176. Count Equal and Divisible Pairs in an Array

public class CountEqualAndDivisible {
    static void main(String[] args) {
        int[]nums={3,1,2,2,2,1,3};
        int k=2;
        System.out.println(countPairs(nums,k));
    }

    static int countPairs(int[] nums, int k) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    if((i*j)%k==0){
                        count+=1;
                    }
                }
            }
        }
        return count;
    }
}

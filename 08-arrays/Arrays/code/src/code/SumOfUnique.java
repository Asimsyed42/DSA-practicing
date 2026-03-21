package assignment;

//https://leetcode.com/problems/sum-of-unique-elements/description/?envType=problem-list-v2&envId=array
//1748. Sum of Unique Elements

public class SumOfUnique {
    static void main(String[] args) {
        int[]nums={1,2,3,2};
        System.out.println(sum(nums));
    }
    static int sum(int[]nums){
        int sum=0;
        int[]freq=new int[101];

        //count frequency
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        //count unique element
        for(int i=0;i< nums.length;i++){
            if(freq[nums[i]]==1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}

package assignment;

//https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/?envType=problem-list-v2&envId=array
//3688. Bitwise OR of Even Numbers in an Array

public class BitwiseOrEvenInArray {
    static void main(String[] args) {
        int[]nums={1,8,16};
        System.out.println(evenNumberBitwise(nums));
    }
    static int evenNumberBitwise(int[]nums){
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                result|=nums[i];
            }
        }
        return result;
    }
}

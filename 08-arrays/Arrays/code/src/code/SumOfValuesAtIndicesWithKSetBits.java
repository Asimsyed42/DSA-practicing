package assignment;

//https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description/?envType=problem-list-v2&envId=array
//2859. Sum of Values at Indices With K Set Bits

import java.util.ArrayList;
import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
    static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);

        int k=1;
        System.out.println(sumIndicesWithKSetBits(nums,k));
    }
    static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(Integer.bitCount(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;

    }

}

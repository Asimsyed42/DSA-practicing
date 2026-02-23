package assignment;

//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
//1502. Can Make Arithmetic Progression From Sequence

import java.util.Arrays;
public class CanMakeArithmeticProgressionFromSequence {
    static void main() {
        int []arr={2,1,4};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=2;i< arr.length;i++){
            if(arr[i]-arr[i-1]!=diff){
                return false;
            }
        }
        return true;
    }
}

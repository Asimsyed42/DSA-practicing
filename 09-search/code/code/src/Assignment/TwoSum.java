package Assignment;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,9,56,90};
        int target = 8;
        int[] ans = twosum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twosum(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 1; j < numbers.length; j++) {
                if (i!=j) {
                    if (numbers[i] + numbers[j] == target) {
                        return new int[]{i + 1, j + 1};
                    }
                }
            }
        }
        return new int[]{-1,-1} ;
    }
}

package LinearSearch;

import java.util.Arrays;

public class Seach2DArrays {
    public static void main(String[] args) {
        int[][] arr={
                {1,23,34,65,9},
                {54,24,75,84,7},
                {21,2,3,6,5},
        };
        int target = 84;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target) {
                    return new int []{row,col};
                }

            }
        }
        return new int[]{-1,-1} ;
    }
}
// for max value
// initialised it with int max = Integer.MIN_VALUE
// for min value
// initialised it with int min = Integer.MAX_VALUE
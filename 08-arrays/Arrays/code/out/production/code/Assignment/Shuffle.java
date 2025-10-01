package Assignment;

import java.util.Arrays;

public class Shuffle {
        static int[] shuffle(int[] nums, int n) {
            int[] result = new int[2 * n];
            for (int i = 0; i < n; i++) {
                result[2 * i] = nums[i];       // xi
                result[2 * i + 1] = nums[i + n]; // yi
            }
            return result;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] ans = shuffle(nums, 3);
        System.out.print(Arrays.toString(ans));

    }


}

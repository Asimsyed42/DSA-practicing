package Assignment;

public class GoodPair {
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j starts at i+1!
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1));  // Should print 4

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums2));  // Should print 6

        int[] nums3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums3));  // Should print 0
    }
}

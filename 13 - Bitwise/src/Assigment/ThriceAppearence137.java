package Assigment;

public class ThriceAppearence137 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            // Update ones and twos with current number
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        // "ones" will hold the single unique number
        return ones;
    }
}

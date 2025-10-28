package Assignment;

class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    static int majorityElement(int[] nums) {
        int maxCount = nums[0];
        int i =0;
        while (i<nums.length){
            int count =0;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (maxCount<count){
                maxCount=nums[i];
            }

            i++;
        }
        return maxCount;
    }
}
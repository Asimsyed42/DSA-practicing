package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayOrder{
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>(5);
        for (int i = 0; i < nums.length; i++) {

            target.add(index[i], nums[i]);

        }
        int[] ans = new int[target.size()];

        for (int i = 0; i < target.size(); i++) {
            ans[i] = target.get(i);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = createTargetArray(nums,index);
        System.out.print(Arrays.toString(target));
    }
}
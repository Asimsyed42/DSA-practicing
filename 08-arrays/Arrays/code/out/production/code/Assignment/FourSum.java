public package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FourSum {

    public static void main(String[] args) {
        
    }
    public List<List<Integer>> fourSum(int[] nums ,  int target) {
       
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k+1; l < nums.length; l++) {
                         if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                        List<Integer> quadlets = new ArrayList<>();
                        quadlets.add(nums[i]);
                        quadlets.add(nums[j]);
                        quadlets.add(nums[k]);
                        quadlets.add(nums[l]);
                        Collections.sort(quadlets); // to avoid duplicate order
                            if (!list.contains(quadlets)) {
                                list.add(quadlets);
                            }
                        }
                    }
                   
                }
            }
        }
        return list;
    }
}
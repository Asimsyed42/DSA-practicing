package Assignment;


import java.util.ArrayList;
import java.util.List;

public class Candies {
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = max(candies);
        for (int i=0;i<candies.length;i++){
            candies[i] += extraCandies;
            if (candies[i] >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    static int max(int[] candies){
        int maxVal = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>maxVal){
                maxVal=candies[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args){
        int[] nums = {2,3,5,1,3};
        List<Boolean> ans = kidsWithCandies(nums, 3);
        System.out.println(ans);
    }

}
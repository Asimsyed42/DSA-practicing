import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class Solution {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(6, 5, 7));
        list.add(Arrays.asList(4, 1, 8, 3));
        int ans = minimumTotal(list);
    }
    static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        for (List<Integer> innerList : triangle) {
            int min = Integer.MAX_VALUE;
            for (int num : innerList) {
                if (num < min) {
                    min = num;
                }
                sum += min ;
            }

        }
        return sum ;
    }
}
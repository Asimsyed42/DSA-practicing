 package Assignment;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        System.out.println(Arrays.toString(sort(nums)));
    }
    static int[] sort(int[] arr) {
        int [] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (i!=j && ans[i] < ans[j]) {
                    swap(ans,j,i);
                }
            }
        }
        return ans;    
    }
    static void swap (int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
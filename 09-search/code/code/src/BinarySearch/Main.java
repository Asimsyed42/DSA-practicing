package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr={-18,-9,-6,0,1,3,5,9,12,15,19,23};
        int target = -18;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    static  int binarySearch(int[] nums, int target){
        int start =0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            if (target< nums[mid]){
                end = mid-1;
            } else if (target> nums[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

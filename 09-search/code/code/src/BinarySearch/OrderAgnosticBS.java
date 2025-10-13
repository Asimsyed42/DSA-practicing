package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={32,30,26,21,15,14,12,10,5,4,1};
        int target = 26;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end =arr.length-1;

        // find whether the array is sorted in
        // ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end = mid-1;
                } else {
                    start=mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end = mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}

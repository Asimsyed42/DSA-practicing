package Assignment;

public class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans =0;
        int sum1=0;
        int sum2=0;
        for (int i =0;i < nums1.length; i++){
            sum1 += nums1[i];
        }
        for (int j =0;j < nums2.length; j++){
            sum2 += nums2[j];
        }
        ans = ((sum1/nums1.length)+(sum2/nums2.length))/2;
        
        return ans;
    }
    public static void main(String[] args) {
        int [] nums1 = {1,3};
        int [] nums2 = {2,4};
        
    }
}


package Sorting;

import java.util.Arrays;

public class InPlaceMS {
    public static void main(String[] args) {
        int[] nums ={1,2,5,3,4,6,8,7,9};
        mergeSortInPlace(nums, 0,nums.length);
        System.out.println(Arrays.toString(nums));
    }
    static void mergeSortInPlace(int[] arr, int s , int e){
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid, arr.length);

        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr , int s, int m, int e) {
        int[] mix = new int[e-s];
        int i =s;
        int j=m;
        int k=0;

        while (i<m && j<e){
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        // it may happen that one of thr arrays is not complete
        while (i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}

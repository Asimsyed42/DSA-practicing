package Assignment;

import java.util.Arrays;

public class kthPositive {
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        System.out.println("Test 1 - Array: " + Arrays.toString(arr1) + ", k: " + k1);
        System.out.println("The " + k1 + "th missing positive integer is: " + findKthPositive(arr1, k1));
        
        // Test case 2
        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;
        System.out.println("\nTest 2 - Array: " + Arrays.toString(arr2) + ", k: " + k2);
        System.out.println("The " + k2 + "th missing positive integer is: " + findKthPositive(arr2, k2));
        
        // Test case 3
        int[] arr3 = {1, 3, 5, 7};
        int k3 = 1;
        System.out.println("\nTest 3 - Array: " + Arrays.toString(arr3) + ", k: " + k3);
        System.out.println("The " + k3 + "rd missing positive integer is: " + findKthPositive(arr3, k3));
    }
    
    // Binary search approach - O(log n) time complexity
    public static int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Number of missing integers before arr[mid]
            // For a sorted array, the expected value at index i should be i+1
            // So missing numbers before arr[mid] = arr[mid] - (mid + 1)
            int missingCount = arr[mid] - mid - 1;
            
            if (missingCount < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        // Calculate the kth missing number
        // If left == 0, it means we need to find kth missing from the beginning
        // Otherwise, we calculate based on the position where we stopped
        return left + k;
    }
    
    // Alternative linear approach - O(n) time complexity
    public static int findKthPositiveLinear(int[] arr, int k) {
        int current = 1;  // Start checking from 1
        int index = 0;    // Index for array
        int missingCount = 0;
        
        while (missingCount < k) {
            if (index < arr.length && arr[index] == current) {
                index++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }
        
        return current;
    }
}

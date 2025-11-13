package ArraysQues;

public class IsSorted {
    static boolean IsSorted(int[] arr){
        return helper(arr, 0);
    }
    static boolean helper(int [] arr, int index){
        if (index==arr.length-1){
            return true;
        }
        if (arr[index]>arr[index+1]){
            return false;
        }
        return helper(arr, index+1);
    }
    //another method in short space
    static boolean sorted(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4};
        boolean ans = IsSorted(nums);
        System.out.println(ans);
    }
}

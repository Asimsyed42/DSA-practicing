package code;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 5, 31,15,51 };
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }
    // imagine array is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    // max value in range
    static int maxRange(int[] arr, int start, int end){
        int maxVal = 0;
        for (int i = start; i < end; i++) {
            if (arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}

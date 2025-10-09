package LinearSearch;

public class MaxMin2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,23,34,65,9},
                {54,24,75,84,7},
                {21,2,3,6,5},
        };
        int min = min(arr);
        int max = max(arr);
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]<min) {
                    min = arr[row][col];
                }

            }
        }
        return min;
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max) {
                    max = arr[row][col];
                }

            }
        }
        return max;
    }

}

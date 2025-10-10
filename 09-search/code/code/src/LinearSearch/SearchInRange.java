package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr ={2,1,5,6,8,9};
        int target = 8;
        int ans = linearSeach(arr, target,1,5);
        System.out.println(ans);
    }
    static int linearSeach(int[ ] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}

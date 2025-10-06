package LinearSearch;


public class Main {
    public static void main(String[] args) {
        int[] arr ={1,25,84,35,59,7,53};
        int target = 35;
        int ans = linearSeach(arr,target);
        System.out.println(ans );
    }
    static int linearSeach(int[ ] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}

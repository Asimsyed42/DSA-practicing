package ArraysQues;

public class LinearSearch {
    static int search(int[] arr, int target, int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return search(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] nums ={2, 3, 6, 1, 5};
        System.out.println(search(nums,8, 0));
    }
}

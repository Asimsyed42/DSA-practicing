package ArraysQues;

import java.util.ArrayList;

public class  AL {

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    // without assigning AL out of function
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1, list);
    }
    // GOAL: return the AL but don't take it into the argument
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 3, 4,3,3};
//        findAllIndex2(nums, 3, 0);
//        System.out.println(list);
        System.out.println(findAllIndex2(nums, 3, 0));
        // for good practice assign new AL in main function
        // specially for findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list)
    }
}

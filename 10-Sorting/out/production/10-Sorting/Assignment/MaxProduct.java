package Assignment;

class MaxProduct {
    static int maximumProduct(int[] nums) {
        int ans = -1 ;
        if (nums.length <3){
            if (nums.length==2){
                ans = (nums[nums.length-1])*(nums[nums.length-2]);
            }
            if (nums.length ==1){
                ans = (nums[nums.length-1]);
            }

        }else {bubble(nums);
             ans = (nums[nums.length-1])*(nums[nums.length-2])*(nums[nums.length-3]);

        }
        return ans ;
    }
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped =false;
            // for each step the max will come
            // to its last respective position
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // if you didn't swa for a particular value of i ,
            // it means the array is sorted hence stop the comparison
            if (!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={};
        int ans = maximumProduct(arr);
        System.out.println(ans);
    }
}
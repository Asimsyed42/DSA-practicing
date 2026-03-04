package Assignment;

class SolutionJava {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7};
        int ans = alternatingSum(arr);
        System.out.println(ans);
    }
    static int alternatingSum(int[] nums) {
        int evenSum = 0 ;
        int oddSum =0;
        for(int num : nums){
            if(num%2==0){
                evenSum += num ;
            }else{
                oddSum += num ;
            }
        }
        return evenSum - oddSum;
    }
}
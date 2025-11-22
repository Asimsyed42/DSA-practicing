package String;

class Solution {
    static int addDigits(int num) {
        
        if(num%10 == num ){
            return num ;
        }
        int ans =0;
        while(num>0){
            int rem = num%10;
            ans += rem;
            num /= 10;
        }
        return addDigits(ans);
    }

    public static void main(String[] args) {
        int ans = addDigits(921);
        System.out.println(ans);
    }
}
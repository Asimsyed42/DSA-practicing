package Bitwise;

public class NumofDigits {
    static int numberOfDigits(int n ){
        int b = 2;
        // where b is base
        int ans ;
        ans = (int)(Math.log(n)/Math.log(b))+1;
        return ans ;
    }

}

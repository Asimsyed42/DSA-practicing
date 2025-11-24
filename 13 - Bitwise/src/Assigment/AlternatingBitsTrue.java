package Assigment;

public class AlternatingBitsTrue {
    public static void main(String[] args) {
        boolean ans = hasAlternatingBits(6);
        System.out.println(ans);
    }
    static boolean hasAlternatingBits(int n) {
        while(n> 0){
            int x = n & 1;
            int y = (n>>1)&1;
            if (x == y){
                return false;
            }
        }
        return true;
    }
}

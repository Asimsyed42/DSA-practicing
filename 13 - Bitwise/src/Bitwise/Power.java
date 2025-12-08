package Bitwise;

public class Power {
    public static void main(String[] args) {

        System.out.println(power(3,6));
    }
    static int power(int base , int power){
        int ans = 1 ;
        while (power > 0 ){
            if ((power & 1 )== 1){
                ans *= base;
            }

            power = power >> 1;
            base *= base ;
        }
        return ans ;
    }
}

package Assignment;
public class PerfectSqure {
    static boolean isPerfectSquare(int num) {
        if (num < 1){
            return false;
        }
        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            if (sq == num) return true;
            else if (sq < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 16;
        boolean ans = isPerfectSquare(num);
        System.out.println(ans);
    }
}

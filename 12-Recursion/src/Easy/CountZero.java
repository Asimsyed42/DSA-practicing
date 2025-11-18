package Easy;

public class CountZero {
    static void countZero(int n, int count){
        if (n%10 == n){
            System.out.println(count);
            return;
        }
        int last = n % 10;
        if (last == 0){
            countZero(n/10, count+1);
        }else{
            countZero(n/10, count);
        }
    }

    public static void main(String[] args) {
        countZero(10203, 0);
    }
}

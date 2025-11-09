package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n ){
        for (int row = n; row >= 1; row--) {
            //for every row, run the column
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }

            // when row is printed, we need to add a newline
            System.out.println();
        }
    }
}

package Bitwise;

public class PascalTriangle {
    static long sumOfNthRow(int n) {
        return 1L << (n - 1); // Equivalent to Math.pow(2, n - 1) but uses bit shifting for efficiency
    }
}

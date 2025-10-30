package Assignment;

public class EqualOrNot {
    public static void main(String[] args) {

    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String result1 = String.join("",word1);
        String result2 = String.join("",word2);
        boolean ans = result1.equals(result2);
        return ans;
    }
}

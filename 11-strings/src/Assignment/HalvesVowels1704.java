package Assignment;

public class HalvesVowels1704 {
    public boolean halvesAreAlike(String s) {

        int length = s.length();
        int mid = length / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);
        a = a.toLowerCase();
        b = b.toLowerCase();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countA++;
            }
        }
        for (int j = 0; j < b.length(); j++) {
            char ch = b.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countB++;
            }
        }
        return countA == countB;

    }
}

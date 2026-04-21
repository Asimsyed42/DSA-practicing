package code;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[4];  // Now this refers to java.lang.String
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[0]="Asim";
        System.out.println(Arrays.toString(str));
    }
}

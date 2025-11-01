package Code;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Asim Syed Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('s'));
        System.out.println("     Asim   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
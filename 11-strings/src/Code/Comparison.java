package Code;

public class Comparison {
    public static void main(String[] args) {
        String a = "Asim";
        String b = "Asim";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Asim");
        String name2 = new String("Asim");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
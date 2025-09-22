package code;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//
//        list.add(12);
//        list.add(24);
//        list.add(36);
//        list.add(48);
//        list.add(60);
//        list.add(72);
//
//        System.out.println(list);
//        list.set(0, 99);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+ " "); // i is index
        }
        System.out.println();
        System.out.println(list);
        
    }
}

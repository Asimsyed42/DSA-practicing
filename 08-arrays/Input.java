package code;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(StringExample[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=60;
        arr[1]=50;
        arr[2]=40;
        arr[3]=30;
        arr[4]=20;
        System.out.println(arr[4]);

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        for (int num : arr) { //for every ele in array, print the ele
            System.out.print(num + " "); // here num represent ele of array
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
}

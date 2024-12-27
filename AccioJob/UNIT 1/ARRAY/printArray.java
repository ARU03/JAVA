package AccioJob.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Array declare and Initilize
        int[] marks = new int[5];

        marks[0] = 30;
        marks[1] = 40;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 90;

        System.out.println(Arrays.toString(marks));
        System.out.println(marks[3]);

    }

}

package AccioJob.ARRAY;

import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] marks = new int[5];

        marks[0] = 40;
        marks[1] = 50;
        marks[2] = 60;
        marks[3] = 70;
        marks[4] = 80;

        for (int val : marks) {
            System.out.print(val + " ");
        }

    }

}

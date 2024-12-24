package AccioJob.ARRAY;

import java.util.Scanner;

public class arrayTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] marks = new int[5];

        marks[0] = 30;
        marks[1] = 40;
        marks[2] = 50;
        marks[3] = 60;
        marks[4] = 70;

        for (int idx = 0; idx < marks.length; idx++) {
            System.out.print(marks[idx] + " ");
        }
    }

}

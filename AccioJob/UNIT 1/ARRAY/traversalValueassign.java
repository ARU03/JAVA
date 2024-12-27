package AccioJob.ARRAY;

import java.util.Scanner;

public class traversalValueassign {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Create array length
        // if one time set the value then next time value will not be changed; it will
        // be automatically saved in text;
        int[] marks = new int[5];

        // Assigning Value
        for (int idx = 0; idx < marks.length; idx++) {
            marks[idx] = idx + 3;
        }

        // For Printing
        for (int idx = 0; idx < marks.length; idx++) {
            System.out.print(marks[idx] + " ");
        }
    }

}

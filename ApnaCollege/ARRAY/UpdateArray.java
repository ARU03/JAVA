package ApnaCollege.ARRAY;

import java.util.Scanner;
import java.util.Arrays;

public class UpdateArray {

    public static void update(int marks[], int nonChangable) {

        nonChangable = 10;

        // Adding Values of Arrys Here
        for (int idx = 0; idx < marks.length; idx++) {
            marks[idx] = marks[idx] + 1;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Create an Array Here ;

        // int[] arr = new int[5];
        int[] marks = { 10, 44, 98 };
        int nonChangable = 5;
        System.out.println("Befor Calling Function : " + nonChangable);

        update(marks, nonChangable);

        // Print Our Marks Here ;
        for (int idx = 0; idx < marks.length; idx++) {
            System.out.print(marks[idx] + " ");
        }
        System.out.println();

        System.out.println("After Calling Function : " + nonChangable);

    }

}

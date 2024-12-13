package AccioJob.Nested_Loop;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your  Input Here: ");
        int input = scn.nextInt(); // Lines of Input
        int mid = input + 1 / 2;

        // 1st Part

        for (int row = 1; row <= mid; row++) {
            for (int spaces = 1; spaces <= mid - row; spaces++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= 2 * row - 1; str++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // 2nd Part

        for (int row = 1; row <= mid - 1; row++) {
            for (int spaces = 1; spaces <= row; spaces++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= 2 * (mid - row) - 1; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

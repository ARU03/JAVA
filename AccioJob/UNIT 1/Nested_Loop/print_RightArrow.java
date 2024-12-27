package AccioJob.Nested_Loop;

import java.util.*;

public class print_RightArrow {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = sc.nextInt();
        Solution.printRightArrowPattern(n);
    }

}

class Solution {
    static void printRightArrowPattern(int n) {

        // Calculate middle row index
        int mid = n / 2;

        // Upper part of the arrow (above the middle)
        for (int row = 0; row < mid; row++) {
            // Print spaces
            for (int col = 0; col < mid; col++) {
                System.out.print("  ");
            }
            // Print stars
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Middle part of the arrow
        for (int row = 0; row < n; row++) {
            System.out.print("* ");
        }
        System.out.println();

        // Lower part of the arrow (below the middle)
        for (int row = mid - 1; row >= 0; row--) {
            // Print spaces
            for (int col = 0; col < mid; col++) {
                System.out.print("  ");
            }
            // Print stars
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

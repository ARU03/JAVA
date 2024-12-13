package AccioJob.Nested_Loop;

import java.util.Scanner;
/*
 Diamond Pattern
Given an integer N, print a diamond full of stars * with height equal to N.

Note It is given that N is odd.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains an integer N denoting the height of the pyramid.

Output Format
For each test case print the required pattern.

Example 1
Input

1
5
Output
            *
          * * *
        * * * * *
          * * *
            *

Explanation
The required diamond of height 5 has been returned.

Example 2
Input
1
3
Output
           *
         * * *
           *
Explanation

The required diamond of height 3 has been returned.
 */

public class PatternDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        System.out.print("Enter your Test Case Here : ");
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            // Read the height N for each test case
            System.out.print("Enter Your Height Here : ");
            int N = scanner.nextInt();

            // Upper part of the diamond (including the middle line)
            for (int i = 1; i <= N / 2 + 1; i++) {
                // Print leading spaces
                for (int j = 1; j <= N / 2 + 1 - i; j++) {
                    System.out.print("  ");
                }
                // Print stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Lower part of the diamond
            for (int i = N / 2; i >= 1; i--) {
                // Print leading spaces
                for (int j = 1; j <= N / 2 + 1 - i; j++) {
                    System.out.print("  ");
                }
                // Print stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Print a blank line between test cases if there are more
            if (testCases > 0) {
                System.out.println();
            }
        }

    }

}

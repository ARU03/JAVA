package AccioJob.Nested_Loop;

import java.util.Scanner;
/*
 Print Number Pattern 2
Given an integer n, print a pattern of n lines, where the ith line has the numbers i to 1 printed in descending order. Check the sample cases for a better understanding.

Input Format:
Input consists of an integer N.

Output Format:
Print the pattern as described above.

Example 1
Input:

5
Output:

Pattern Image

Example 2
Input:

3
Output::

Pattern Image

Constraints
1 <= n <= 9
 */

public class PrintNumPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        for (int row = 1; row <= input; row++) {
            int val = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(val);
                val--;
            }
            System.out.println();
        }

    }

}

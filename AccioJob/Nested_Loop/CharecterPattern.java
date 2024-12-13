package AccioJob.Nested_Loop;

import java.util.Scanner;
/*
  Print Character Pattern
You are given a number N. Print a pattern consisting of N rows, where the first row has 1 A, the second row has 2 Bs, and so on for N letters. Check the examples for a better understanding.

Input Format
First line of input contains N, the number of rows for the pattern

Output Format
You need to print the pattern.

Example 1
Input

4
Output:

Pattern Image

Explanation:

For number of rows to be 4 we get this output.

Example 2
Input

5
Output:

Pattern Image

Explanation:

For number of rows to be 5 we get this output.

Constraints:

1 <= N <= 26
 */

public class CharecterPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Number Here : ");
        int input = scn.nextInt();

        for (int row = 1; row <= input; row++) {
            char ch = (char) ('A' + (row - 1));
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}

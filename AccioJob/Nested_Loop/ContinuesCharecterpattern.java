package AccioJob.Nested_Loop;

import java.util.Scanner;

/*

Print Continuous Character Pattern
Given an integer n that denotes the number of rows to be printed, print the pattern in which each row starts with its corresponding alphabet and has a length equal to the row number. (See the examples for a better understanding).

Note: You can take the alphabet to be cyclic. On reaching Z, you will cycle back to A, then B, and so on.
Input Format
First line contains the value n representing the number of rows.

Output Format
Print the pattern.

Example 1
Input

5
Output

Example 2
Input

8
Output

Constraints
1 <= n <= 26

*/

public class ContinuesCharecterpattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        for (int row = 1; row <= input; row++) {
            char ch = (char) ('A' + (row - 1));
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                if (ch == 'Z') {
                    ch = 'A';
                } else {
                    ch++;
                }
            }
            System.out.println();
        }
    }

}

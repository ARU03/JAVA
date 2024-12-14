package AccioJob.String;

import java.util.*;
/*
 Camel Case
You are given a string consisting of different words separated by underscores _. You have to convert the string to camel case. The first letter of the entire case should be lowercase.

eg: app_dsd_sdda to appDsdSdda

Note:

StringBuilder in Java represents a mutable sequence of characters.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains the string S.

Output Format
For each test case print the final formed string in a new line.

Example 1
Input:

1
abb_b_cc_d
Output:
abbBCcD

Explanation:

We remove the underscores and convert the next character to uppercase.

Example 2

Input:
1
how_are_you

Output:
howAreYou

Explanation:
We remove the underscores and convert the next character to uppercase.

Constraints:

1 <= T <= 10
1 <= |S| <= 100000

 */

public class CammelCase {
    public static void camelcase(String s) {
        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);

            if (ch == '_') {
                continue;
            }

            if (idx > 0 && s.charAt(idx - 1) == '_') {
                ch = (char) (ch - 32);
                System.out.print(ch);
            }

            else {
                System.out.print(ch);
            }

        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your TestCase Here :: ");
        int t = scn.nextInt();

        while (t-- > 0) {
            System.out.print("Enter Your Input Here :: ");

            // It reads first whiteSpaced Character;
            String s = scn.next();

            camelcase(s);
            System.out.println();
        }
    }

}

package AccioJob.StringBuilder;

import java.util.*;
/*
 ASCII string
You are given a string str that contains only lowercase alphabets.

You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.

Note Complete the given function. The input and output would be handled by the driver code.

Input Format
The only line contains the string str.

Output Format
Print the new string.

Example 1
Input

abecd
Output

a1b3e-2c1d
Explanation

'b' - 'a' = 1
'e' - 'b' = 3
'c' - 'e' = -2
'd' - 'c' = 1
Example 2
Input

abc
Output

a1b1c
Explanation

'b' - 'a' = 1
'c' - 'b' = 1
Constraints
1 <= |str| <= 1000
 */

public class AsciiString {
    public static String ASCIIstring(String str) {
        // To Store The Final String
        StringBuilder result = new StringBuilder();

        // Loop iterate over 1st Character to 2nd Last Character because calculate
        // difference between consicutive characters
        for (int i = 0; i < str.length() - 1; i++) {

            // Append the current Character to the result;
            result.append(str.charAt(i));

            // Calculate the diff between two consicutive characters
            int diff = str.charAt(i + 1) - str.charAt(i);

            // Append the difference to the result;
            result.append(diff);
        }
        // Append the last Character to the result
        result.append(str.charAt(str.length() - 1));

        // return the final result of String
        return result.toString();

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        String str = scn.next();
        String result = ASCIIstring(str);
        System.out.print(result);
    }

}

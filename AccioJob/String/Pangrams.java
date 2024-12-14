package AccioJob.String;

import java.util.*;
/*
 Pangrams
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

Input Format
The first line inputs a string, S.

Output Format
In a new line, print "pangram" if string contains every letter of the alphabet else "not pangram".

Example 1
Input

We promptly judged antique ivory buckles for the next prize
Output

pangram
Explanation All of the letters of the alphabet are present in the string.

Example 2
Input

We promptly judged antique ivory buckles for the prize
Output

not pangram
Explanation

The string lacks an x.

Constraints:
0 < length of s <= 1000\

Each character of s, s[i]∈{a-z,A-Z,space}
 */

public class Pangrams {
    public static void isPangram(String s) {
        // All charater convert to Lower Case::
        String str = s.toLowerCase();
        // Create a boolean Array
        boolean[] arr = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            // Identifying the current index
            char ch = str.charAt(i);

            // Check if the chareacter is a lower case alphabetic letter; and ensure that
            // character is between 'a' to 'z';;
            if (ch >= 'a' && ch <= 'z') {

                // This calculate the index in the arr for current letter ::
                int idx = ch - 'a';

                // Sets the value in the boolean array to true, indicating that the letter
                // exists in the string.
                arr[idx] = true;
            }

        }

        for (int idx = 0; idx < arr.length; idx++) {

            // If any index in the array is false, it means the corresponding letter is
            // missing from the string.
            if (arr[idx] == false) {

                System.out.print("not Pangram");
                return;

            }

        }

        System.out.print("Pangram");

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        String s = scn.nextLine();
        isPangram(s);
    }

}

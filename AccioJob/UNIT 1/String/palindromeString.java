package AccioJob.String;

import java.util.*;
/*
 Palindrome String
Given a string str, determine if it is a palindrome, considering only alphabetic characters and ignoring the upper or lower case. Return 0 if it is not a palindrome, else return 1.

Input Format
Input consists of one line

The first line given is a string str.

Output Format
Returns 0 if it is not a palindrome, else return 1 if it is a palindrome

Example 1

Input
race a car

Output
0

Explanation
Not a palindrome

Example 2

Input
a man, a plan, a canal Panama

Output
1

Explanation

It is a palindrome.

Constraints
1 <= str.length <= 10000
 */

public class palindromeString {
    public static int isPalindrome(String str) {

        // All Strings are Converted into Lower Case;
        str = str.toLowerCase();

        // Initilization of starting and Ending Index;
        int st = 0;
        int end = str.length() - 1;

        while (st < end) {

            // the character at starting and ending pointer;
            char sch = str.charAt(st);
            char ech = str.charAt(end);

            if (sch < 'a' || ech > 'z') {
                st++;
                continue;
            }

            if (sch < 'a' || sch > 'z') {
                end--;
                continue;
            }

            if (sch != ech) {
                return 0;
            }

            else {
                st++;
                end--;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        String str = scn.nextLine();

        int result = isPalindrome(str);
        System.out.print(result);
    }

}

package AccioJob.String;

import java.util.*;
/*
 Toggle Characters
Given a string of length N, toggle the case of all the characters in the string, i.e. You should set all lowercase characters to uppercase and vice versa.

Please note that the string may contain numbers or special characters as well.

Input Format
The input consists of two lines.

The first line of the input contains one integer N, denoting the size of the string.

The second line of the input contains the string S.

Output Format
Your code should output the string S with its characters toggled.

Example 1
Input

8
helloABC
Output

HELLOabc
Explanation

All the lower case alphabets got converted into upper case and vice versa.

Example 2
Input

4
aBC1
Output

Abc1
Explanation

All the lower case alphabets got converted into upper case and vice versa.

Constraints
`1 <= N <= 2*10^5``

where n is the size of the string.
 */

public class ToggleCharacter {
    public static void toggleCase(int n, String str) {
        for (int idx = 0; idx < n; idx++) {
            // Get the character ar String idx;;
            char ch = str.charAt(idx);

            if (ch >= 'a' && ch <= 'z') {

                // Check Lower Case and Convert to Upper Case
                /*
                 * The ASCII value of 'a' is 97, and 'A' is 65. To convert
                 * from lowercase to uppercase, subtract 32 from the ASCII value of ch.
                 */
                ch = (char) (ch - 32);

            }

            else if (ch >= 'A' && ch <= 'Z') {

                // Check Upper Case and Convert to Lower Case
                /*
                 * The ASCII value of 'A' is 65, and 'a' is 97. To convert from uppercase
                 * to lowercase, add 32 to the ASCII value of ch.
                 */
                ch = (char) (ch + 32);

            }

            System.out.print(ch);

        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Length Here :: ");
        int n = scn.nextInt();

        System.out.print("Enter Your Characters Here :: ");
        // consumes the leftover newline character after reading n.
        scn.nextLine();

        String str = scn.nextLine();
        toggleCase(n, str);

    }

}

/*
 * >>>>>>>>>>>>>>>>>>>>>>>>> inbuild functions are Available
 * <<<<<<<<<<<<<<<<<<<<<<<<<<
 * 
 * if (Character.isLowerCase(ch)) {
 * ch = Character.toUpperCase(ch);
 * }
 * 
 * else if (Character.isUpperCase(ch)) {
 * ch = Character.toLowerCase(ch);
 * }
 */

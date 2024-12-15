package AccioJob.String;

import java.util.*;
/*

Inverse Camel Case ::

One of the important aspect of object oriented programming is readability of the code. 
To enhance the readability of code, developers write function and variable names in Camel Case.
You are given a string S, written in Camel Case. Find All The Words Contained In It.

Note ::

Complete the given function. The input would be handled by the driver code. You only have to print the answer.

Input Format::

The only line contains the string S.

Output Format ::

Print each word in a new line

Example 1 ::

Input

IAmAJavaProgrammer

Output

I
Am
A
Java
Programmer
Explanation

We separate each word and print them in a new line.

Example 2 ::
Input

OnePiece

Output

One
Piece

Explanation ::
We separate each word and print them in a new line.

Constraints
1 <= |str| <= 10000
 */

public class InverseCamelCase {
    public static void solution(String str) {

        // Iterate through the string character by character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' && i != 0) {
                System.out.println();
            }

            System.out.print(ch);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        String str = scn.next(); // Input string
        solution(str); // Call the solution method
    }

}

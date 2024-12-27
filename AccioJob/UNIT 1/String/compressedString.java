package AccioJob.String;

import java.util.*;
import java.io.*;
/*
 Compressed Strings
You are given a string 'S'. You need to compress it using the following algorithms:

Take an empty string res. For every block of consecutive repeating character, do the following:

If the size of block is 1, concatenate it to the end of `S`.
Else, concatenate the character followed by the size of the block.

Return res after completing the above operations on the whole string

Note

StringBuilder in Java represents a mutable sequence of characters.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains the string 'S'

Output Format
For each test case return the string res. Input and output is inbuilt.

Example 1
Input:

1
abbbccd
Output:

ab3c2d
Explanation:

a occurs once, so, we add a to res.

Then, b is repeated 3 times so, b3 is added.

Then, c is repeated 2 times so, c2 is added.

d occurs once, so, we add d to res.

Example 2
Input:

1
aabccc
Output:

a2bc3
Explanation:

a is repeated 2 times so, a2 is added.

b occurs once, so, we add b to res.

Then, c is repeated 3 times so, c3 is added.

Constraints
1 <= T <= 10
1 <= |S| <= 100000
 */

public class compressedString {

    static void compressedStr(String s) {
        System.out.print(s.charAt(0)); // print the first character of the String

        int count = 1; // count is initilization is 1;

        for (int idx = 1; idx < s.length(); idx++) {
            char currch = s.charAt(idx); // it indicating the current index character;
            char prevch = s.charAt(idx - 1); // It indicating the previous character of a String;

            if (prevch == currch) {
                count++; // count will be updated;
            } else {
                if (count > 1) {
                    System.out.print(count);
                }

                System.out.print(currch);
                count = 1; // count will be reset to 1;
            }
        }

        if (count > 1) {
            System.out.print(count);
        }
    }

    public static void main(String[] args) throws IOException {
        /*
         * throws IOException ---> signifies that a method might encounter an I/O
         * (Input/Output) exception
         * during its execution. This is a checked exception, meaning the compiler
         * forces you to handle it explicitly.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Integer.parseInt ---> is a static method of integer class that converts a
        // string representation of a number into an integer ( premitive int type );
        // br.readLine() ---> it is a method of buffered reader class it is used to read
        // line of text from an input string...
        System.out.print("Enter Your Test Cases Here : ");
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            System.out.print("Enter Your Input Here : ");

            // Read the Input
            String s = br.readLine();

            // Call the compression of the method
            compressedStr(s);

            System.out.println();
        }
    }

}

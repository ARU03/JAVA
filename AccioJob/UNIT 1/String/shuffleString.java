package AccioJob.String;

import java.util.*;
/*
 Shuffle String
Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Print the shuffled string.

Input Format
Input consists of two lines.

First line contains an integer n.

Second line contains the string.

Last line contains the indices separated by space.

Output Format
Print the shuffled string.

Example 1
Input

8
acciojob
4 5 6 7 0 2 1 3
Output

oojbacci
Explanation

As the problem states "acciojob" becomes "oojbacci" after shuffling.

Example 2
Input

3
abc
0 1 2
Output

abc
Explanation

No shuffling is done here.

Constraints
1 <= n <= 500
 */

public class shuffleString {
    public static void shuffleString(int[] indices, String s) {

        // Create a character arry to hold the shuffled result
        char[] shuffled = new char[s.length()];

        // Place the characte as its new position as per indices Array
        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }

        // Print the Shuffled Result
        for (int i = 0; i < shuffled.length; i++) {
            System.out.print(shuffled[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Read the Length of the String :: ");
        int n = scn.nextInt();
        System.out.print("Read the Input of the String :: ");
        String str = scn.next();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Your Index Inputs Here :: ");
            arr[i] = scn.nextInt();
        }

        // Call the Shuffle String Function with the input String and indices
        shuffleString(arr, str);

        // Scanner object closes the underlying input stream and frees up any system
        // resources allocated for it
        scn.close();

    }

}

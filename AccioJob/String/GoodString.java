package AccioJob.String;

import java.util.*;
/*
 Good Strings
You are given a set 'S' of distinct characters. You are also given an array 'A' of 'N' strings.

A String in array 'A' is called good if all the characters of the string is present in the set 'S'.

You have to find how many strings in the array 'A' are good.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains a string denoting the characters of the set 'S'.

The next line contains 'N', the number of strings in 'A'.

The next 'N' lines contains a string each, which are the elements of the array 'A'.

Output Format
For each test case print the count of good strings in a new line.

Example 1
Input:

1
abc
4
ab
abd
cacb
cabef
Output:

2
Explanation:

Only 'ab' and 'cacb' are good strings. Rest of the strings contain characters apart from 'abc'.

Example 2
Input:

1
pq
3
pqqqpp
abc
rst

Output:
1

Explanation:

Only 'pqqqpp' is a good string.

Constraints

1 <= T <= 10

1 <= |S| <= 26

1 <= N <= 1000

1 <= |A[i]| <= 1000
 */

public class GoodString {
    public static int goodStrings(String s, String[] A, int n) {

        int goodCount = 0; // Counter for Good Strings

        // Itrate over each String in Array 'A'
        for (String str : A) {
            boolean isGood = true;

            // Check each Character in the String::
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                // If the Character is not in 's', mark the String as "not Good";
                if (!s.contains(String.valueOf(c))) {
                    isGood = false;
                    break;
                }

            }

            if (isGood) {

                goodCount++; // Increment the count for good String

            }

        }
        return goodCount;
    }

    public static void main(String[] args) {
        // This line creates a Scanner object that helps in taking input from the user.
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Your Test Cases Here :: ");

        // This line reads the number of test cases from the user.
        int t = scn.nextInt();

        // This is a loop that runs for ‘t’ times. For each iteration:
        while (t-- > 0) {

            // This reads the characters of the set ‘S’ from the user. The characters are
            // read as a single string,
            // where each character in the string is a character in the set ‘S’.
            String s = scn.next();
            System.out.print("Enter Your Input Here :: ");
            // This reads the number of strings in the array ‘A’.
            int n = scn.nextInt();

            // This creates an array ‘A’ of ‘n’ strings and reads these strings from the
            // user.
            String[] A = new String[n];
            for (int i = 0; i < n; i++) {
                A[i] = scn.next();
            }

            // Print the number of good String for this testCase...
            System.out.println(goodStrings(s, A, n));

        }
    }

}

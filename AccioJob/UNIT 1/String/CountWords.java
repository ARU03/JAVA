package AccioJob.String;

import java.util.*;
/*

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ###### Count words in a given string ######  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

You are given a string containing some space-separated words. You need to count the number of words in the string.

NOTE ::

You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format
The first line contains the number of test cases.

For each test case: The first line has the string S.

Output Format
For each test case return the number of words.

Example 1

Input:

1
this is  a sample   string 

Output::
5

Explanation
There are five words which are 'this' , 'is' , 'a' , 'sample' , 'string'.

Example 2::

Input
1
gear five

Output
2

Explanation
The two words that are present here are 'gear', and 'five'.

Constraints:
1 <= T <= 10
1 <= |S| <= 10000

 */

public class CountWords {

    public static int countWords(String s) {
        int itr = 0;
        int len = s.length();
        int count = 0;

        while (itr < len) {

            while (itr < len && s.charAt(itr) == ' ') {

                itr++;

            }

            if (itr < len) {

                count++;

            }

            while (itr < len && s.charAt(itr) != ' ') {

                itr++;

            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Your TestCase Input Here :: ");
        int t = scn.nextInt();

        String p = scn.nextLine();
        while (t > 0) {

            System.out.print("Enter Your String Input Here :: ");
            String s = scn.nextLine();
            System.out.println(countWords(s));
            t--;
        }
    }

}

package AccioJob.Nested_Loop;

import java.util.*;

/*
Staircase
In this question, you need to write a program that prints a staircase of size N.

This is a staircase of size n=4:

   #
  ##
 ###
####

Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Input Format ::

A single integer, n, denotes the size of the staircase.

Output Format ::

Print a staircase of size n using # symbols and spaces.

Note: The last line must not have spaces in it.

Example 1::

Input
6

Output

     #
    ##
   ###
  ####
 #####
######

Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.
You might notice, first line has 5 spaces (n-1) followed by 1 # and the last line has 0 spaces (n-n) and 6 # (n)

Example 2 ::

Input
5

Output

    #
   ##
  ###
 ####
#####

Explanation::

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=5.
You might notice, first line has 4 spaces (n-1) followed by 1 # and the last line has 0 spaces (n-n) and 5 # (n)

Constraints
1 <= n < 100

*/

public class StairCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        int spaces = n - 1;
        int stairs = 1;

        for (int i = 1; i <= n; i++) {
            for (int count = 1; count <= spaces; count++) {
                System.out.print("  ");
            }
            for (int count = 1; count <= stairs; count++) {
                System.out.print("# ");
            }

            spaces--;
            stairs++;
            System.out.println();
        }

    }

}

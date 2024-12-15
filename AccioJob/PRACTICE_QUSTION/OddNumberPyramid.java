package AccioJob.PRACTICE_QUSTION;

import java.util.*;
/*
 Odd Number Pyramid
Take input of N from the user and write a program to print the Full Pyramid Number pattern as follows (N=4) :

Pattern Image

Input Format
Input consists of the integer N.

Output Format
Print the pattern for value N.

Example 1
Input

4
Output

   1   
  333  
 55555 
7777777
Explanation

Input is 4 means we have 4 lines, and each line has odd numbers which keep on increasing with every row.

Example 2
Input

3
Output

  1   
 333  
55555 
Explanation

Input is 3 means we have 3 lines, and each line has odd numbers which keep on increasing with every row.

Constraints
1 <= N <= 100
 */

public class OddNumberPyramid {
    public static void printPattern(int n) {
        int number = 1;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= 2 * row - 1; str++) {
                System.out.print(number);
            }

            // Everytim after completing the loop the number will be upgrade by addition of
            // number 2;
            number += 2;

            System.out.println();
        }
        // return number;
    }

    public static void main(String[] args) {
        // Taking Scanner Input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        // Taking int Input Here
        int n = scn.nextInt();
        printPattern(n);
    }

}

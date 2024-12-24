package AccioJob.Recursion;

import java.util.*;
/*
Recursively Print Numbers
Write a recursive program to print all numbers starting from 1 till N. The sequence should be 1 2 3 ... N.

Input Format
Input consists of a single integer N

Output Format
Print the numbers between 1 and N in ascending order, each separated by a single space.

Example 1
Input

5
Output

1 2 3 4 5
Example 2
Input

10
Output

1 2 3 4 5 6 7 8 9 10
Constraints
1 <= N <= 1000
 */

public class RecursivelyPrintNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        int n = scn.nextInt();
        printNumber(n);
    }

    public static void printNumber(int n) {
        // Base case: if n is 1, stop recursion
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // Calling the function recursively
        printNumber(n - 1);
        // Printing the number
        System.out.print(n + " ");
    }

}

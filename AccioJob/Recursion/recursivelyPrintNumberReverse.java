package AccioJob.Recursion;

import java.util.*;
/*
 Recursively Print Numbers In Reverse
Write a recursive program to print all numbers starting from N till 1. Print numbers in descending order from N till you reach 1.

Input Format
Input consists of a single integer N

Output Format
Print the numbers between N and 1 in descending order, each separated by a single space.

Example 1
Input

5
Output

5 4 3 2 1
Example 2
Input

10
Output

10 9 8 7 6 5 4 3 2 1
Constraints
1 <= N <= 1000
 */

public class recursivelyPrintNumberReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        int n = scn.nextInt();
        printNumberReverse(n);
    }

    public static void printNumberReverse(int n) {
        // Base case: if n is 1, stop recursion
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // Printing the number
        System.out.print(n + " ");
        // Calling the function recursively
        printNumberReverse(n - 1);
    }

}

package AccioJob.Recursion;

import java.util.*;
/*
 Print n times
Write a recursive program to print the word "AccioSchool" N times. Take an integer input, N, from the user and create a recursive function to print "AccioSchool" N times.

Input Format
A single line containing the integer N

Output Format
Print the word "AccioSchool" N number of times, each time in the next line.

Example 1
Input

5
Output

AccioSchool
AccioSchool
AccioSchool
AccioSchool
AccioSchool
Explanation

We print AccioSchool 5 times.

Example 2
Input

3
Output

AccioSchool
AccioSchool
AccioSchool
Explanation

We print AccioSchool 3 times.

Constraints
1 <= |N| <= 10^4
 */

public class printAccioSchool {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        int n = scn.nextInt();
        printAccioSchool(n);
    }

    public static void printAccioSchool(int n) {
        // Base case: if n is 0, stop recursion
        if (n == 0) {
            return;
        }
        // Printing the string
        System.out.println("AccioSchool");
        // Calling the function recursively
        printAccioSchool(n - 1);
    }

}

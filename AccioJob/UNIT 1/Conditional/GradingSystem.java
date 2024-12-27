package AccioJob.Conditional;

import java.util.Scanner;
/*
 Grading System
You are given marks of a student as input. Display a correct message based on the following rules:

for marks above 90, print "Excellent".
for marks above 80 and less than equal to 90, print "Good"
for marks above 70 and less than equal to 80, print "Fair".
for marks above 60 and less than equal to 70, print "Meets Expectations".
for marks below and equal to 60, print "Below Expectations".


Input Format
There is a single integer N.

Output Format
Print a single string in a line.

Example 1
Input

95
Output

Excellent
Explanation

As according to the given condition, for N (marks) >90 - Excellent is printed

Example 2
Input

75
Output

Fair
Explanation

As according to the given condition, for 70 < N (marks) <= 80 - Fair is printed
 */

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        if (input > 90) {
            System.out.println("Excellent");
        } else if (input > 80 && input <= 90) {
            System.out.print("Good");

        } else if (input > 70 && input <= 80) {
            System.out.print("Fair");

        } else if (input > 60 && input <= 70) {
            System.out.print("Meets Expectations");

        } else if (input <= 60) {
            System.out.print("Bellow Expectation");
        }
    }

}

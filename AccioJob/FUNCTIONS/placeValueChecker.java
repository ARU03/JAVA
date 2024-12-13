package AccioJob.FUNCTIONS;

import java.util.*;
/*
 Place Value Checker
Given a positive integer N. The task is to Create a function and return true or false according to the condition that whether zero is present at the second last place value or not.

You have to print the output in the calling function itself based on the boolean value you get in return from the function.

The output should be Yes or No.

Input Format
Input consists of a single line of integer n.

Output Format
Print Yes if the second last place value is 0 else No.

EXAMPLE 1
Input:

100
Output::

Yes
EXPLANATION:

0 is it's second last digit.

EXAMPLE 2
Input:

11
Output::

No
EXPLANATION:

1 is it's second last digit.

CONSTRAINTS
10 <= n <= 1000000
 */

public class placeValueChecker {

    public static boolean DetermineSecondLastDigit(int n) {
        // Check if the number have only one Digit
        if (n < 10) {
            return false;
        }

        // Remove the last Digit and check the second last Digit
        n /= 10;

        // Get the new last digit , which is second last digit of original n;
        int secondLastDigit = n % 10;

        return secondLastDigit == 0;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();
        boolean res = DetermineSecondLastDigit(n);
        if (res) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

}

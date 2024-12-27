package AccioJob.FUNCTIONS;

import java.util.*;
/*
 Calculate nCr
Given n and r, your task is to calculate nCr.

Here nCr is the total number of ways for selecting r elements out of n options are nCr = (n!) / (r! * (n-r)!)  where n! = 1 * 2 * . . . * n.

Input Format
Input consists of one line having two integers n followed by r.

Output Format
You have to calculate nCr using the formula as given and return the value to the main function.

Example 1
Input

5 2

Output
10

Example 2::
Input
3 1

Output
3

Constraints
1 <= n <= r <= 20
 */

public class calculatenCr {
    static long factorial(int n) {
        long fact = 1;
        for (int idx = 0; idx <= n; idx++) {
            fact = fact * idx;
        }
        return fact;
    }

    public static long calculate_nCr(int n, int r) {
        long nfact = factorial(n);
        long rfact = factorial(r);
        long nmrfact = factorial(n - r);
        long ans = nfact / (rfact * nmrfact);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your n Here : ");
        int n = scn.nextInt();
        System.out.print("Enter Your Second Input Here : ");
        int r = scn.nextInt();

        // Calling function;
        long ans = calculate_nCr(n, r);
    }

}

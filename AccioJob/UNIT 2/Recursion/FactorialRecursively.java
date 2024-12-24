package AccioJob.Recursion;

import java.util.*;
/*
 Factorial Recursively
Given a number n, find its factorial using recursion.

Input Format
Input consists only of integer n.

Output Format
Print the factorial of the number.

Example 1
Input

5
Output

120
Explanation

1 * 2 * 3 * 4 * 5 = 120.

Example 2
Input

10
Output

3628800
Explanation

1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800.

Constraints
0 <= n <= 18
 */

public class FactorialRecursively {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        // Base case: if n is 0, return 1
        if (n == 0) {
            return 1;
        }
        // Calling the function recursively
        return n * factorial(n - 1);
    }

}

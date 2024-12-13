package AccioJob.Nested_Loop;

import java.util.*;

/*
 Optimus Prime
Given an integer n, print all prime numbers between 1 and n (both inclusive).

Example:

If n = 8, your program should output all prime numbers between 1 and 8. Thus, it should output:

2
3
5
7
Input Format
The first line of the input contains one integer n.

Output Format
Your code should output all integers between 1 and n that are prime (both inclusive).

Example 1
Input:

8
Output:

2
3
5
7
Example 2
Input:

13
Output:

2
3
5
7
11
13
Constraints
1 <= n <= 10^5

 */

public class OptimusPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        // loop will itrates all numbers 2 to n;
        for (int i = 2; i <= n; i++) {
            // isprime is initilize with true value;
            boolean isPrime = true;

            /*
             ** the condition will check the square of j is less or equal to i;
             * Step 2: First Iteration (j = 2)
             * Condition: j * j <= i → 2 * 2 = 4 <= 29 (True).
             * We check if 29 is divisible by 2 (i % j == 0 → 29 % 2 == 0).
             * 29 is not divisible by 2, so the loop continues.
             * Increment j to 3 (j++).
             * 
             */
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }

}

package AccioJob.Nested_Loop;

import java.util.Scanner;

/*
 Diamond Pattern
Given an integer N, print a diamond full of stars * with height equal to N.

Note It is given that N is odd.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains an integer N denoting the height of the pyramid.

Output Format
For each test case print the required pattern.

Example 1 :

Input

1
5

Output ::

    *     
  * * *   
* * * * * 
  * * *   
    *    

Explanation

The required diamond of height 5 has been returned.

Example 2
Input

1
3

Output ::

  *   
* * * 
  * 

Explanation
The required diamond of height 3 has been returned.

 */

public class diamondPat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Read the number of test cases
        System.out.print("Enter Your TestCases Here : ");
        int testCases = scn.nextInt();

        while (testCases > 0) {

            // Read the height N for each test case
            System.out.print("Enter Your Height Here : ");
            int N = scn.nextInt();

            // Upper part of the diamond (including the middle line);; +1 because the
            // iteration will be equal to perfect half
            for (int i = 1; i <= N / 2 + 1; i++) {
                // Print leading spaces
                // Loop will be run till the one less than n/2 or one less than the outer
                // iteration
                for (int j = 1; j <= N / 2 + 1 - i; j++) {
                    System.out.print("  ");
                }

                // Print stars
                // loop will be run equal to star loop but star will be print equal to the half
                // diamond;
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Lower part of the diamond
            // i is initilization with half of the input and the i will be decrease after
            // every iteration;
            for (int i = N / 2; i >= 1; i--) {
                // Print leading spaces
                // spaces is initilazation with 1 and the condition is spaces will be print till
                // row updation equal to j ( j will increase every iteration)
                for (int j = 1; j <= N / 2 + 1 - i; j++) {
                    System.out.print("  ");
                }
                // Print stars
                // stars will be print from the n-1; loop will run equal to 2 * n/2 - 1
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            testCases--;
        }

    }

}

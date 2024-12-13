package AccioJob.Nested_Loop;

import java.util.Scanner;
/*
Star Pyramid
Given an integer n, print a pyramid full of stars with height equal to n.

Input Format
The first line of input contains the integer n.

Output Format
The output should contain a pyramid filled with stars with height equal to n.

Example 1
Input

3
Output:

Pattern Image

Example 2

Input
7

Output ::

      *     
     * *    
    * * *   
   * * * *  
  * * * * * 
 * * * * * *  
* * * * * * * 

Pattern Image

Constraints
1 <= n <= 200

*/

public class StarPyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        int input = scn.nextInt();

        // 1st iteration will be run equal to n'th row;
        for (int row = 1; row <= input; row++) {

            // row increase, spaces will be increase and the comparision will be decrease
            // till the equal ::
            for (int spaces = 0; spaces <= input - row - 1; spaces++) {
                System.out.print(" ");
            }

            // star printing will be continue till the row equal to the stars ;
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}

package AccioJob.Nested_Loop;

import java.util.*;
/*
Star Pattern 4
Take input of N from the user and write a program to print the following pattern (N=4) :


* * * *  
  * * *  
    * * 
      *

Input Format
First line contains an integer N.

Output Format
Print the required pattern.

Example 1
Input

4 

Output

* * * *  
  * * *  
    * * 
      *

Explanation

Pattern for N=4.

Example 2
Input

3 

Output

* * * 
  * * 
    *

Explanation

Pattern for N=3. 

Constraints
1 <= N <= 15
 */

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        for (int row = 1; row <= n; row++) {

            // spaces 1st iteration will be not print anything
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print("  ");
            }

            // 1st iteration will be print n numbers stars and row 1 , stars = 1 < n+1 - row
            // ,,, Row increase means star printing will be decreasse
            for (int stars = 1; stars <= n + 1 - row; stars++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}

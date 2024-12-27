package AccioJob.Nested_Loop;

import java.util.*;

/*
Star Pattern 2
Take input of N from the user and write a program to print the following pattern (N=3) :


* * * 
* *   
*     


Input Format
First line contains an integer N.

Output Format
Print the required pattern.

Example 1
Input

3

Output

* * * 
* *   
*     


Explanation

Pattern for N=3.

Example 2
Input

4

Output

* * * *
* * * 
* *   
*     

Explanation

Pattern for N=4. 
*/

public class StarPattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Rows Here : ");
        int n = scn.nextInt();

        for (int col = 1; col <= n; n--) {
            for (int row = 1; row <= n; row++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

package AccioJob.Nested_Loop;

import java.util.*;

/*

Star Pattern 1
Take input of N from the user and write a program to print the following pattern (N=5) :


* 
* * 
* * * 
* * * * 
* * * * *

Input Format
single line consisting of an integer N.

Output Format
Print the required pattern.

Example 1
Input


5

Output


* 
* * 
* * * 
* * * * 
* * * * *

Explanation
Pattern for N = 5

Example 2
Input


3

Output

* 
* * 
* * * 

Explanation
Pattern for N = 3

*/

public class StarPattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Row Input Here : ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

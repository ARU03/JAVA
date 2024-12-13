package AccioJob.Nested_Loop;

import java.util.*;
/*
 Print Number Pattern 2
Given an integer n, print a pattern of n lines, where the ith line has the numbers i to 1 printed in descending order. Check the sample cases for a better understanding.

Input Format:
Input consists of an integer N.

Output Format:
Print the pattern as described above.

Example 1
Input:

5
Output:

1    
21   
321  
4321 
54321

Example 2
Input:

3
Output::

1    
21   
321

Constraints
1 <= n <= 9
 */

public class printNumberPattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        for (int row = 1; row <= n; row++) {
            int value = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(value);
                value--;
            }
            System.out.println();
        }
    }

}

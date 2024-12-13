package AccioJob.Nested_Loop;

import java.util.*;
/*
Star Pattern 3
Take input of N from the user and write a program to print the following pattern (N=4) :

      * 
    * * 
  * * *
* * * *  

Input Format
First line contains an integer N.

Output Format
Print the required pattern.

Example 1
Input

4 

Output

      * 
    * * 
  * * *
* * * *  

Explanation

Pattern for N=4.

Example 2
Input

3 

Output

      * 
    * * 
  * * *

Explanation

Pattern for N=3. 
*/

public class Starpattern3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter Your Input Here : ");
    int n = scn.nextInt();

    int spaces = n - 1;
    int stars = 1;

    for (int i = 1; i <= n; i++) {
      for (int count = 1; count <= spaces; count++) {
        System.out.print("  ");
      }
      for (int count = 1; count <= stars; count++) {
        System.out.print("* ");
      }
      spaces--;
      stars++;
      System.out.println();
    }
  }

}

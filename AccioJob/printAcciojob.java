package AccioJob.Recursion;
import java.util.*;
/*
 Print ACCIOJOB
Using recursion, your task is to print string ACCIOJOB, n times.

Input Format
First line contains integer n

Output Format
Print the string ACCIOJOB, n times.

Example 1
Input

3
Output

ACCIOJOB
ACCIOJOB
ACCIOJOB
Explanation:

As the value of n is 3 so, we get 3 times ACCIOJOB.

Example 2
Input

1
Output

ACCIOJOB
Explanation:

As the value of n is 1, so we get ACCIOJOB 1 times.

Constraints
1 <= n <= 104
 */
public class printACCIOJOB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        int n = scn.nextInt();
        printACCIOJOB(n);
    }

    public static void printACCIOJOB(int n) {

        if (n == 0) {
            return;
        }
        // Printing the string
        System.out.println("ACCIOJOB");
        // Calling the function recursively
        printACCIOJOB(n - 1);
    }
    
}
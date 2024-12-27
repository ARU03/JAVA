package AccioJob.Conditional;

import java.util.Scanner;

/*
Conditional Problem 5
Given a number n, If the number is divisible by 6 then print Divisible else Not divisible.

Input Format
First line contains an integer.

Output Format
If the number is divisible by 6 then Divisible will be printed. If the number is not divisible by 6 then Not divisible will be printed.

Example 1
Input

28
Output

Not divisible
Explanation

28 is not divisible by 6.

Example 2
Input

24
Output

Divisible
Explanation

24 is divisible by 6.
*/

public class Problem5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Input Here : ");
        int input = scn.nextInt();

        if (input % 6 == 0) {
            System.out.println("The Number is Divisible.");
        } else {
            System.out.println("The Number is not Divisible.");
        }
    }

}

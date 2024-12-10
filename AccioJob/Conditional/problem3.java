package AccioJob.Conditional;

import java.util.Scanner;
/*
Conditional Problem 3
You are provided with a number n.
Your task is to return a string according to the following conditions:

If the number is greater than 1, then return You entered more
If the number is less than or equal to 1 then return You entered less

Input Format
First line contains a positive integer n.

Output Format
Return the output as per instruction in the input.

Example 1
Input

1
Output

You entered less
Explanation

Since 1 = 1, you entered less is printed.

Example 2
Input

5
Output

You entered more
Explanation

Since 5 > 1, you entered more is printed.
*/

public class problem3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        if (input > 1) {
            System.out.print("You Entered More.");
        } else if (input <= 1) {
            System.out.print("You Entered Less.");
        }

    }

}

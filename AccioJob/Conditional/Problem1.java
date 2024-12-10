package AccioJob.Conditional;

import java.util.Scanner;

/*
Conditional Problem 1
Given an integer n. Your task is to write a program to use switch case as follows :

if the input number is 28, print i am young.
else print i am not young.
Input Format
First line contains an integer n.

Output Format
Print the statement based on value of n as given above.

Example 1
Input

28
Output

i am young
Example 2
Input

30
Output

i am not young
 */

public class Problem1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Yout Input Here : ");
        int input = scn.nextInt();

        if (input <= 28) {
            System.out.print("I am Young.");
        } else {
            System.out.print("I am not Young.");
        }

    }

}

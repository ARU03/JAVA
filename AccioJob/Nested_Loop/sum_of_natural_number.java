package AccioJob.Nested_Loop;

import java.util.Scanner;

/*
Sum of Natural Numbers
You are given an integer N. Your task is to output the sum of all natural numbers till N.

Natural numbers are a part of the number system, including all the positive numbers from 1 to infinity.

Input Format
First line is an integer N

Output Format
Print the sum of the first N natural numbers.

Example 1
Input

5
Output

15
Explanation

Here, n = 5, so 1 + 2 + 3 + 4 + 5 = 15
 */

public class sum_of_natural_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Input Here : ");
        int input = scn.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= input) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}

package AccioJob.Nested_Loop;

import java.util.Scanner;

/* 
 Armstrong Numbers in Range
You are given two numbers m and n, you are required to print all the Armstrong Numbers between m and n (both inclusive).

Armstrong Numbers are numbers those have the sum of their own digits raised to the power number of digits equals the number itself. Eg. 153 = 13 + 53 + 33, so 153 is an Armstrong number.

Input Format
First line contains two integers m and n

Output Format
Print all the Armstrong numbers between m and n in a single line with space   in between.

Example 1
Input

0 160
Output

0 1 2 3 4 5 6 7 8 9 153
Constraints
0 <= m <= n <= 105
 */

public class ArmstNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your First Input Range Here : ");
        int m = scanner.nextInt();
        System.out.print("Enter Your Last Input Range : ");
        int n = scanner.nextInt();
        scanner.close();

        // Loop through each number in the range [m, n]
        for (int i = m; i <= n; i++) {
            int sum = 0;

            // Calculate the number of digits in i
            int digits = 0;
            int temp = i;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            // Calculate the sum of each digit raised to the power of 'digits'
            temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            // Check if the sum is equal to the original number (i)
            if (sum == i) {
                System.out.print(i + " ");
            }

        }

    }
}

package AccioJob.LooPss;

import java.util.*;

/*

Print Digits::

Given the number n, print its digits starting from most significant digit to least significant digit.

Input Format
Input consists of single line which has the integer n.

Output Format
print the digits of number one line at a time.

Example 1

Input
1256

Output
1
2
5
6

Explanation
Here, the digits are, 1,2,5,6.

Example 2

Input
12345

Output
1
2
3
4
5

Explanation
Here the digits are 1,2,3,4,5.

*/

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        int count = 0;
        int revNum = 0;

        while (n != 0) {
            int lastDigit = n % 10; // Extract the Reminder;

            revNum *= 10; // extract the lastDigit;
            revNum += lastDigit;

            n /= 10; // to remove the second last;
            count++; // for repeat the loop;
        }

        while (count > 0) {
            int lastDigit = revNum % 10;
            revNum /= 10;
            count--;
            System.out.println(lastDigit);
        }
    }

}

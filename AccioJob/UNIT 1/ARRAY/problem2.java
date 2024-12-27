package AccioJob.ARRAY;

import java.util.Scanner;
import java.util.Arrays;

/*
 Array Problem 2
Write a program to count the elements in an array which are greater than 35.

Input Format:
First line contains n, the size of an array.

Next line contains n-spaced integers representing array arr.

Output Format:
Print the number of the elements present in the array which are greater than 35.

Example 1
Input

5
12 67 89 16 23
Output

2
Explanation

67 and 89 are greater than 35. Hence, the output is 2.

Example 2
Input

4
22 39 45 72
Output

3
Explanation

39, 45, and 72 are greater than 35. Hence, the output is 3.

Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^6
 */

public class problem2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Array Length Here : ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print("Enter Your Array Inputs Here : ");
            arr[idx] = scn.nextInt();
        }

        // Function Calling
        int ans = ArrayProblem2(n, arr);
        System.out.println("The Value Count Is : " + ans);
    }

    public static int ArrayProblem2(int n, int[] arr) {
        int value = 35;
        int count = 0;

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > value) {
                count++;
            }
        }
        return count;
    }

}

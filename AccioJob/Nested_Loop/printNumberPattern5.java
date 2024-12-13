package AccioJob.Nested_Loop;

import java.util.*;

/*
 Print Number Pattern 3
You are given n the number of row of the pattern you have to print.

Input Format
The first line of input contains n the number of rows in the pattern.

Output Format
For each n, print the following pattern.

Example 1::

Input
5

Output::
0
1 1
2 3 5
8 13 21 34
55 89 144 233 377

Explanation::
In the example input you are given 5 rows, and this is the desired patttern.

Example 2

Input
7

Output::

0
1 1
2 3 5
8 13 21 34
55 89 144 233 377
610 987 1597 2584 4181 6765
10946 17711 28657 46368 75025 121393 196418

Explanation::
The 7 row pattern is given in the output.

Constraints
1 <= n <= 50
 */

public class printNumberPattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();
        int a = 0, b = 1, sum = 0;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(sum + " ");
                a = b;
                b = sum;
                sum = a + b;
            }
            System.out.println();
        }
    }

}

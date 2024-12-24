package AccioJob.Recursion;

import java.util.*;
/*
Print between X & Y
Write a recursive program to print all the numbers between the range X to Y (X<=Y). Take input of X and Y from the user and print all the integers between the range X to Y using a recursive function.

Input Format
First line contains an integer X (X>0)

Second line contains an integer Y (Y>0)

Output Format
Print the numbers between X and Y, each separated by a single space.

Example 1
Input

5
8
Output

5 6 7 8
Explanation

The numbers between 5 to 8 included are 5,6,7 and 8.

Example 2
Input

15
15
Output

15
Explanation

The numbers between 15 to 15 included is 15.

Constraints
1 <= X <= Y <= 10^6
 */

// public class printBetweenXandY {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter Your X'S Input Here :: ");
//         int x = scn.nextInt();
//         System.out.print("Enter Your Y'S Input Here :: ");
//         int y = scn.nextInt();

//         printBetweenXandY(x, y);
//     }

//     public static void printBetweenXandY(int x, int y) {
//         // Base case: if x is equal to y, stop recursion
//         if (x == y) {
//             System.out.print(x + " ");
//             return;
//         }
//         // Calling the function recursively
//         printBetweenXandY(x, y - 1);
//         // Printing the number
//         System.out.print(y + " ");
//     }

// }

// ********************************************************    Method 2    ********************************************************

public class printBetweenXandY {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your X'S Input Here :: ");
        int x = scn.nextInt();
        System.out.print("Enter Your Y'S Input Here :: ");
        int y = scn.nextInt();

        printBetweenXandY(x, y);
    }

    public static void printBetweenXandY(int x, int y) {
        // Base case: if x is equal to y, stop recursion
        if (x > y) {
            return;
        }
        // Printing the number
        System.out.print(x + " ");
        // Calling the function recursively
        printBetweenXandY(x + 1, y);
    }

}

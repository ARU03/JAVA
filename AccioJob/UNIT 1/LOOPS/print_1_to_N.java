package AccioJob.LOOPS;

import java.util.Scanner;

/*  
Print 1 to N
You are given an integer N.
You are required to write a program that prints numbers from 1 to N
where N is a positive integer provided by the user.

Input Format
single line consisting of an integer N.

Output Format
Print numbers in the range [1 , N].

Example 1
Input


10

Output


1 2 3 4 5 6 7 8 9 10  */

public class print_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number Here : ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

}

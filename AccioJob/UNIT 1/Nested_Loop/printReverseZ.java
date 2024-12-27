package AccioJob.Nested_Loop;

import java.util.Scanner;
/*
 Pattern : 

******
 *
  *
   *
    *
******
 */

public class printReverseZ {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int i = 0; i < n; i++) {

            System.out.print("* ");
        }

    }

}

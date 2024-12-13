package AccioJob.Nested_Loop;

import java.util.*;

public class printStarDiamond {

    public class Main {

        public static void main(String[] args) throws Throwable {
            Scanner cs = new Scanner(System.in);
            int n = cs.nextInt();
            cs.close();
            Solution solution = new Solution();
            solution.pattern(n);
        }

    }

}

class Solution {
    public void pattern(int n) {

        // print the upper part the diamond;
        for (int i = 1; i <= n; i++) {
            // Printing the Spaces
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }

            // Print stars with spaces between
            for (int stars = 1; stars <= i; stars++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading Spaces
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }

            // Print Stars with spaces between
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

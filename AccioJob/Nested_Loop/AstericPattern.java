package AccioJob.Nested_Loop;

import java.util.*;

public class AstericPattern {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        for (int group = 1; group <= input; group++) {
            for (int str = 1; str <= group; str++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }

}

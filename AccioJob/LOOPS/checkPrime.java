package AccioJob.LooPss;

import java.util.*;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Number Here : ");
        int input = scn.nextInt();

        if (input % 2 == 0) {
            System.out.print(input + " It is a Palindrome Number.");
        } else {
            System.out.print(input + " It is not a Palindrome Number.");
        }

    }

}

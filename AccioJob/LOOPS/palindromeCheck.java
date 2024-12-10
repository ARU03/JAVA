package AccioJob.LooPss;

import java.util.*;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        int rev = 0;
        int z = n;

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10; // Extract the last digit;
        }

        // check if number if palindrome
        if (rev == z) {
            System.out.print("It is a Palindrome Number.");
        } else {
            System.out.print("It is not a Palindrome Number.");
        }
    }

}

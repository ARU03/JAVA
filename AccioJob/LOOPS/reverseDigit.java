package AccioJob.LooPss;

import java.util.*;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        while (input > 0) {
            int lastDigit = input % 10; // Get the reminder and print
            System.out.print(lastDigit); // Print the last Digit
            input /= 10; // Extract the last Digit
        }
        System.out.println();
    }

}

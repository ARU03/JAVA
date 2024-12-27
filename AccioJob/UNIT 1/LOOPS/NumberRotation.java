package AccioJob.LOOPS;

import java.util.*;

public class NumberRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.print("Enter Your Number Here : ");
        n = sc.nextInt();
        System.out.print("Enter Your Rotating Input : ");
        k = sc.nextInt();

        // Convert Integer to a String
        String numStr = Integer.toString(n);
        int length = numStr.length();

        // Normalize k to be within the bounds of the number length
        k = k % length;

        // If k is negative, convert it to a positive equivalent for left rotation
        if (k < 0) {
            k += length;
        }

        // Rotate one digit at a time using loops
        for (int i = 0; i < k; i++) {
            numStr = numStr.charAt(numStr.length() - 1) + numStr.substring(0, numStr.length() - 1);
        }

        // printing the Output
        System.out.println(numStr);
    }

}

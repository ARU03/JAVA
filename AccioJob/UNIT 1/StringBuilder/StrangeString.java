package AccioJob.StringBuilder;

import java.util.*;

public class StrangeString {

    public static String strangesString(int n) {

        StringBuilder result = new StringBuilder();

        char currentChar = 'a';

        // A loop itarates from '0' index to n-1 index
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                // Add Character to the End if i is Odd
                result.append(currentChar);
            } else {
                // Add Character to the beginning if Character is Even
                result.insert(0, currentChar);
            }

            // Update the CurrentChar to the next Alphabet in the Cyclic Manner
            currentChar = (char) ((currentChar - 'a' + 1) % 26 + 'a');

        }

        // Convert StringBuilder to String and Return
        return new String(result);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Number of TestCases Here :: ");
        int t = scn.nextInt();

        while (t-- > 0) {

            System.out.print("Enter Your Length of the String :: ");
            int n = scn.nextInt();

            // Output of the result
            System.out.println(strangesString(n));
        }

    }

}

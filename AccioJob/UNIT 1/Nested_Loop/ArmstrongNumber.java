package AccioJob.Nested_Loop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // Read the input range
        System.out.println("Enter Your Range Here : ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // StringBuilder to store the output numbers in a single line
        StringBuilder result = new StringBuilder();

        // Loop through each number in the range
        for (int i = m; i <= n; i++) {
            int originalNum = i;
            int num = i;
            int sum = 0;

            // Calculate the number of digits in the current number
            int numDigits = 0;
            int temp = num;
            while (temp > 0) {
                temp /= 10;
                numDigits++;
            }

            // Special case for 0 (single digit)
            if (numDigits == 0) {
                numDigits = 1;
            }

            // Calculate the sum of the digits raised to the power of numDigits
            while (num > 0) {
                int digit = num % 10;

                // Calculate digit^numDigits using a basic loop
                int power = 1;
                for (int j = 0; j < numDigits; j++) {
                    power = power * digit;
                }

                sum += power;
                num /= 10;
            }

            // Check if the sum is equal to the original number
            if (sum == originalNum) {
                result.append(originalNum).append(" ");
            }
        }

        // Print all Armstrong numbers in a single line
        System.out.println(result.toString().trim());

    }

}

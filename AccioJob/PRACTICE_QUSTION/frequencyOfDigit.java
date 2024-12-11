package AccioJob.PRACTICE_QUSTION;

import java.util.*;

public class frequencyOfDigit {
    public static int FrequencyofDigit(long n, int d) {
        // Convert the number to a String
        String number = Long.toString(n);
        char target = Character.forDigit(d, 10);

        int frequency = 0;

        // Itrate through each character of the string and count the matches
        for (char digit : number.toCharArray()) {
            if (digit == target) {
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Integer Digit Here : ");
        long n = scn.nextInt();
        System.out.print("Enter Your Frequency Digit Here : ");
        int d = scn.nextInt();

        System.out.println(FrequencyofDigit(n, d));
    }

}
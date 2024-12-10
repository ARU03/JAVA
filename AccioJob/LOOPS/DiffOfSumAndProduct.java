package AccioJob.LooPss;

import java.util.*;

public class DiffOfSumAndProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        int sum = 0;
        int product = 1;

        while (input != 0) {
            int digit = input % 10;
            sum += digit;
            product *= digit;
            input /= 10;
        }

        int difference = product - sum;
        System.out.print(difference);
    }

}

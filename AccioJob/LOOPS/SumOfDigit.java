package AccioJob.LooPss;

import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        int sum = 0;

        while (input != 0) {
            sum = input % 10;
            input /= 10;
        }

        System.out.print(sum);
    }

}

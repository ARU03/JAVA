package AccioJob.LooPss;

import java.util.*;

public class OddSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        int i = 1;
        long sum = 0;

        while (i <= input) {
            sum += i;
            i += 2;
        }
        System.out.print(sum);
    }

}

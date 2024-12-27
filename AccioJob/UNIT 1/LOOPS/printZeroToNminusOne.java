package AccioJob.LOOPS;

import java.util.*;

public class printZeroToNminusOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Number Here : ");
        int n = scn.nextInt();
        int i = 0;
        while (i <= n - 1) {
            System.out.print(i + " ");
            i++;
        }
    }

}

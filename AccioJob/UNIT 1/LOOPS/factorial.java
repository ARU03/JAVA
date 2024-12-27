package AccioJob.LOOPS;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        long factorial = 1;
        long i = 1;

        while (i <= input) {
            factorial = factorial * i;
            i++;
        }

        System.out.print(factorial);
    }

}

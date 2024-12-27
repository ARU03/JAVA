package AccioJob.FUNCTIONS;

import java.util.*;

public class problem2 {
    public static void fun(int n, int m) {
        int sum = n + m;
        System.out.print("Sum of n and m is :: " + sum);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your First Input Here : ");
        int n = scn.nextInt();
        System.out.print("Enter Your Second Input Here : ");
        int m = scn.nextInt();

        fun(n, m);
    }

}

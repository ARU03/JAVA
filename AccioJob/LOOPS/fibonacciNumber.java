package AccioJob.LooPss;

import java.util.*;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        int a = 0, b = 1, sum = 0;
        int count = 0;
        while (count < n) {
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a + b;
            count++;
        }

    }

}

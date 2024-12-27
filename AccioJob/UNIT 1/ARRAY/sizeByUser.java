package AccioJob.ARRAY;

import java.util.Scanner;

public class sizeByUser {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        int nums[] = new int[n];

        for (int val : nums) {
            System.out.print(val + " ");
        }
    }

}

package AccioJob.Conditional;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();

        if (n < 30) {
            System.out.println("Less Important.");
        } else {
            System.out.print("More Important.");
        }
    }

}

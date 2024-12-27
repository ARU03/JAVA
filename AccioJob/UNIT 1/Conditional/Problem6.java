package AccioJob.Conditional;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your First Input Here : ");
        int FirstInput = scn.nextInt();
        System.out.print("Enter Your Second Input Here : ");
        int SecondInput = scn.nextInt();

        if (FirstInput % 2 != 0 && SecondInput % 2 != 0) {
            System.out.print("We Are Odd");
        } else {
            System.out.print("We are Simple");
        }

    }

}

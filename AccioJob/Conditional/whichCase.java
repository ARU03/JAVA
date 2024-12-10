package AccioJob.Conditional;

import java.util.Scanner;

public class whichCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");

        // charecter input converted into Integer input
        int ch = scn.next().charAt(0);

        if (ch > 'A' && ch < 'Z') {
            System.out.println("1");
        } else if (ch > 'a' && ch < 'z') {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }

    }

}

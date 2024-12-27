package AccioJob.Conditional;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Inputs Here : ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int Largest;

        if (a >= b && a >= c) {
            Largest = a;
        } else if (b >= a && b >= c) {
            Largest = b;
        } else {
            Largest = c;
        }

        System.out.print("The Largest Number Is : " + Largest);
    }

}

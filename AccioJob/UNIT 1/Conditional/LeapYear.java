package AccioJob.Conditional;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();

        if ((input % 4 == 0 & input % 100 != 0) || input % 400 == 0) {
            System.out.println("The Input is a Leap Year.");
        } else {
            System.out.println("The Input is Not a Leap Year.");
        }
    }

}

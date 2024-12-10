package AccioJob.LooPss;

import java.util.*;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Number Here : ");
        int input = scn.nextInt();

        int i = 1;
        while (i <= 20) {
            System.out.println(input + " x " + i + " = " + (input * i));
            i++;
        }
    }

}

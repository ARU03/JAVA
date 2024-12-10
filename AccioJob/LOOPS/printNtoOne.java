package AccioJob.LooPss;

import java.util.*;

public class printNtoOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Number Here : ");
        int input = scn.nextInt();

        int i = input;

        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }

    }

}

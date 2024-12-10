package AccioJob.LooPss;

import java.util.*;

public class printNminusOnetoZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();
        int i = n - 1;
        while (i >= 0) {
            System.out.print(i + " ");
            i--;
        }
    }

}

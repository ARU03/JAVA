package AccioJob.LOOPS;

import java.util.*;

public class HCFofTwoNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your First Input Here : ");
        int a = scn.nextInt();
        System.out.print("Enter Your Second Input Here : ");
        int b = scn.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.print(a);
    }

}

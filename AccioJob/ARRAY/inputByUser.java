package AccioJob.ARRAY;

import java.util.Scanner;

public class inputByUser {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Array Size Here : ");
        int input = scn.nextInt();

        // Creating Array Here;
        int num[] = new int[input];

        // Creating Array Input Here;
        for (int idx = 0; idx < num.length; idx++) {
            System.out.print("Enter Your Array Values Here : ");
            num[idx] = scn.nextInt();
        }

        for (int val : num) {
            System.out.print(val + " ");
        }
    }

}

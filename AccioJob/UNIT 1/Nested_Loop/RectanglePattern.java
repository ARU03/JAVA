package AccioJob.Nested_Loop;

import java.util.*;

public class RectanglePattern {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Length Here : ");
        int N = scn.nextInt();
        System.out.print("Enter Your Breadth Here : ");
        int M = scn.nextInt();

        for (int group = 1; group <= N; group++) {
            for (int str = 1; str <= M; str++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

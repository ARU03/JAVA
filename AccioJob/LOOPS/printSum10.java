package AccioJob.LooPss;

import java.util.*;

public class printSum10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int input = scn.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= input) {
            sum += i;
            i++;
        }
        System.out.print(sum);
    }
}

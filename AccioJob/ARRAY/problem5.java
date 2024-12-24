package AccioJob.ARRAY;

import java.util.Scanner;
import java.util.Arrays;

public class problem5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt();
        System.out.print("Enter Your Search Value Input Here : ");
        int k = scn.nextInt();

        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            System.out.print("Enter Your Array Values Here : ");
            arr[idx] = scn.nextInt();
        }
        System.out.println("Search Value Count Is : " + ArrayProblem(arr, k));
    }

    public static int ArrayProblem(int arr[], int k) {
        int count = 0;

        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx - 1] + arr[idx] == k) {
                count++;
            }
        }
        return count;
    }

}

package AccioJob.ARRAY;

import java.util.Scanner;

public class subarrayprintt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here : ");
        int n = scn.nextInt(); // Length of Array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Your elements Here: ");
            arr[i] = scn.nextInt();
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        subarray(arr, n);

    }

    public static void subarray(int arr[], int n) {

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {

                    sum = sum + k;
                    sum = sum / 10;
                    System.out.print(arr[k] + " ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }

}

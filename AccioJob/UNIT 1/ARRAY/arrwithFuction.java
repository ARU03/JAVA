package AccioJob.ARRAY;

import java.util.Scanner;
import java.util.Arrays;

public class arrwithFuction {
    public static void swap(int[] arr, int i, int j) {

        /*
         * //to changes in deep copy insert here a new array
         * 
         * int nums[] = new int[arr.length];
         * 
         * int temp = nums[i];
         * nums[i] = nums[j];
         * nums[j] = temp;
         * 
         * 
         */

        // Swap in arrays
        int temp = arr[i]; // int array of i 's value stored in temp variable
        arr[i] = arr[j]; // int array of j 's value stored in array of i means 1st index of array;
        arr[j] = temp; // variable temp value stored in array of j index

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int arr[] = new int[5];

        arr[0] = 9;
        arr[1] = 78;
        arr[2] = 66;
        arr[3] = 200;
        arr[4] = 45;

        // Printing Array Values
        System.out.println("Before Swap : " + Arrays.toString(arr));

        // Calling function
        swap(arr, 1, 4);

        System.out.println("After Swap : " + Arrays.toString(arr));
    }

}

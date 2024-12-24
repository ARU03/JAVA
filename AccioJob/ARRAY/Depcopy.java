package AccioJob.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Depcopy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Creating array Elements;
        int[] arr = { 3, 6, 8, 9, 12 };
        System.out.println(Arrays.toString(arr));

        // Create a new Array Element inside Heap;
        int[] nums = new int[arr.length];

        // Deep Copy of elements inside array
        for (int idx = 0; idx < nums.length; idx++) {
            nums[idx] = arr[idx];
        }

        // Printing the Elements
        System.out.println("nums : " + Arrays.toString(nums));
        System.out.println("arr  : " + Arrays.toString(arr));
    }

}

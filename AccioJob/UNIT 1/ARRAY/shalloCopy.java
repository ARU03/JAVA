package AccioJob.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class shalloCopy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int arr[] = { 2, 5, 6, 1, 9 };
        System.out.println(Arrays.toString(arr));

        // Shallow Copy
        int nums[] = arr;
        System.out.println(Arrays.toString(nums));
    }

}

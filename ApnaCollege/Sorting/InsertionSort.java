package ApnaCollege.Sorting;

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Array Input Size Here :: ");
        int n = scn.nextInt();

        // Declare an array of size n to store the elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "th Element :: ");
            arr[i] = scn.nextInt();
        }

        insertionSort(arr, n);

        // Print the Sorted Array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            // store the element at the current index
            int curr = arr[i];
            int prev = i - 1;

            // Check if the previous element is greater than the current element
            // and Finding out the current position to insert the element
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

}

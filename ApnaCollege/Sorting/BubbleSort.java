package ApnaCollege.Sorting;

import java.util.*;

public class BubbleSort {
    // public acceable to other classes :: static no need to create an object of the
    // class to call the method
    // void return type :: no return type :: String[] args accepts conmmand line
    // aruements
    public static void main(String[] args) {

        // Scanner is a class to take input from the user :: System.in tells the scanner
        // to take input from the console
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Array Input Size Here :: ");
        // read the Size of Array
        int n = scn.nextInt();
        // Declare an array of size n
        int[] arr = new int[n];

        // iterate over the array i = 0th index to n input index

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "th Element :: ");
            // reads the elements of the array and asign in the index i th position
            arr[i] = scn.nextInt();
        }

        // call the bubble sort method to sort the array arr
        bubbleSort(arr, n);

        // print the sorted array
        for (int i = 0; i < n; i++) {

            // print the each element followed by a space
            System.out.print(arr[i] + " ");
        }
    }

    // public accecible anywhere in the program, static can be called without
    // creating an instance of the class
    // void return type :: no return type
    public static void bubbleSort(int[] arr, int n) {

        // Runs from 0 to arr.length - 1 and during each pass the largest unsorted
        // element is moved to its correct position
        for (int turn = 0; turn < arr.length - 1; turn++) {

            // Compares the adjacent elements and swaps them if they are in the wrong order
            for (int j = 0; j < arr.length - turn - 1; j++) {

                // check if the current element is greater than the next element in the array
                // swap them if the swap true put the smaller element first
                if (arr[j] > arr[j + 1]) {
                    // temp stores the value of the current element
                    int temp = arr[j];
                    // moves the smaller element to the arr[j] positon
                    arr[j] = arr[j + 1];
                    // place the larger element in arr[j + 1] position
                    arr[j + 1] = temp;
                }
            }
        }
    }

}

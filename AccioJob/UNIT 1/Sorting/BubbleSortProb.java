package AccioJob.UNIT1.Sorting;

import java.util.*;
/*
 Bubble Sort Problem
Consider the following version of Bubble Sort:

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
        }
    }
}
Print three values in separate lines:

Number of swaps it took to sort the array using the above algorithm.

First element in the array after sorting the array.

Last element in the array after sorting the array.

Input Format
The first line contains an integer, n, the size of the array a.

The second line contains n space-separated integers representing array a .

Output Format
Print the required three values.

Example 1
Input

3
6 4 1
Output

3
1
6
Explanation

[6,4,1]

swap    a       
0       [6,4,1]
1       [4,6,1]
2       [4,1,6]
3       [1,4,6]

The steps of the bubble sort are shown above. It took 3 swaps to sort the array.

Example 2
Input

3
1 2 3
Output

0
1
3
Explanation

Array is sorted in 0 swaps.

First Element: 1

Last Element: 3

Constraints
2 <= n <= 600

1 <= a[i] <= 2*10^6
 */

public class BubbleSortProb {
    public static void bubbleSort(int arr[], int n) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swapping the Elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Increment the Counting of Swaps
                    count++;
                }
            }
        }

        // Printing the number of swaps
        System.out.println(count);

        // Printing the first element of the array
        System.out.println(arr[0]);

        // Printing the last element of the array
        System.out.println(arr[n - 1]);
    }

    public static void main(String[] args) {
        // Taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        // Taking input for size of array
        int n = sc.nextInt();
        // Creating an array of size n
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            // Taking input for array elements
            arr1[i] = sc.nextInt();
        }
        // Calling bubbleSort function
        bubbleSort(arr1, n);
    }

}

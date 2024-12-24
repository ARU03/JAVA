package AccioJob.ARRAY;

import java.util.*;
/*
 Find Geometric Triplets
Write a program to print all the triplets that form a geometric progression. All the elements of the array are in increasing order of their value.

Input Format
Input consists of two lines.

First line contains an integer N denoting size of array

Second line contains N integers denoting the array elements separated by single space

Output Format
Print all the triplets that form a geometric progression, each in a new line. Print each geometric triplet in lexicographic form i.e. if a set of triplet has a lesser value at the same position compared to some other triplet then it has to be printed before the latter one.

Example 1
Input

6
1 2 6 10 18 54
Output

2 6 18 
6 18 54
Example 2
Input

8
2 8 10 15 16 30 32 64
Output

2 8 32
8 16 32
16 32 64
Constraints
1 <= arr.size() <= 10
 */

public class GeometricTripplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the Array :: ");
        int n = scn.nextInt();
        // Creating an array of size n
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            // Taking input of the array elements from the user
            System.out.print("Enter the element at index " + i + " th Position :: ");
            arr[i] = scn.nextInt();
        }
        // Calling the function to find the Geometric Tripplets
        findGeometricTripplets(arr, n);
    }

    public static void findGeometricTripplets(int[] arr, int n) {
        // Loop through the Array
        // First Pointer for find the first element of the Tripplet
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner Loop iterating from i+1 to n
            // Secong Pointer for finding the second element of the Tripplet
            for (int j = i + 1; j < arr.length - 1; j++) {
                // Third Pointer for finding the third element of the Tripplet
                for (int k = j + 1; k < arr.length; k++) {
                    // Store the value of the first element of the Tripplet
                    int a = arr[i];
                    // Store the value of the second element of the Tripplet
                    int b = arr[j];
                    // Store the value of the third element of the Tripplet
                    int c = arr[k];

                    // Skip invalid cases to avoid division by zero
                    if (a == 0 || b == 0) {
                        continue;
                    }

                    // Check if the Tripplet is Geometric or not
                    if (arr[j] * arr[j] == arr[i] * arr[k]) {
                        // Print the Tripplet
                        System.out.println(a + " " + b + " " + c);
                    }
                }

            }
        }
    }

}

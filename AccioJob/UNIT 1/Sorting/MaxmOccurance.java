package AccioJob.UNIT 1.Sorting;
import java.util.*;
/*
 Maximum occurrence
You are given an array arr of length n. Your task is to print the element which has maximum occurrences in the array. If two elements have the same occurrence then print the smaller element

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space seperated integers denoting the elements of the array.

Output Format
Print single integer denoting the maximum occurring element in the array.

Example 1
Input

8
7 7 6 4 8 7 3 1
Output

7
Explanation

We have arr = [7 7 6 4 8 7 3 1]

As 7 is occurring 3

Example 2
Input

7
9 8 1 1 2 2 3
Output

1
Explanation

1 and 2 have smae occurrence that is 2 so print smaller element i.e. 1.

Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^9
 */

public class MaxmOccurance {
    static int maximum_occurrence(int arr[], int n) {
        // Create a HashMap to count the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int i = 1; i < n; i++ ) {
            // If the element is already present in the map, increment the count
           if ( map.containsKey(arr[i])){
                //If the element is already present in the map, increment the count 
                 map.put(arr[i], map.get(arr[i]) + 1 );
           }
           else {
                // If the element is not present in the map, add it to the map
                map.put(arr[i], 1);
           } 
       }
        // Find the Element of Highest frequency
           int maxFreq = 0;
           int maxFreqElement = Integer.MAX_VALUE;
           // Iterate through the map to find the element with the highest frequency
           for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // Get the key and value of the entry
               int key = entry.getKey();
               // Get the value of the entry
               int value = entry.getValue();
               
                // If the value is greater than the max frequency, update the max frequency and max frequency element
               if ( value > maxFreq) {
                   maxFreq = value;
                   maxFreqElement = key;
               }

               // If the value is equal to the max frequency, update the max frequency element if the key is smaller
               else if ( value == maxFreq && key < maxFreqElement) {
                   maxFreqElement = key;
               }
           }
        return maxFreqElement;
       
    }
    public static void main(String args[]) {
        // Create Scanner Object to take input from user
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        int n = sc.nextInt();
        // Create an array of size n
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            // Taking array elements from the user
            arr[i] = sc.nextInt();
        }

        // Calling the function and printing the result
        System.out.print(maximum_occurrence(arr, n));
    }
    
}

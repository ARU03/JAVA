package AccioJob.ArrayList;

import java.util.*;

public class pascalTriAngle {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read the number of rows
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n); // Generate Pascal's Triangle
        for (int i = 0; i < triangle.size(); i++) { // Iterate through each row
            for (int j = 0; j < triangle.get(i).size(); j++) { // Iterate through each element in the row
                System.out.print(triangle.get(i).get(j) + " "); // Print the element followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
        sc.close(); // Close the scanner
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // Initialize the triangle as an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        // Handle the case when numRows is 0
        if (numRows <= 0) {
            return triangle; // Return an empty triangle
        }

        // The first row is always [1]
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate each subsequent row
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> prevRow = triangle.get(i - 1); // Get the previous row
            ArrayList<Integer> currentRow = new ArrayList<>();

            currentRow.add(1); // Every row starts with 1

            // Compute the intermediate values of the current row
            for (int j = 1; j < prevRow.size(); j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(sum);
            }

            currentRow.add(1); // Every row ends with 1

            // Add the current row to the triangle
            triangle.add(currentRow);
        }

        return triangle; // Return the complete Pascal's Triangle
    }

}

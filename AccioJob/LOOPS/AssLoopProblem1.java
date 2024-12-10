package AccioJob.LooPss;

import java.util.*;

public class AssLoopProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize largest and smallest variables
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Loop to take inputs
        while (true) {
            System.out.print("Enter Your Input Here : ");
            int num = sc.nextInt();

            // Update largest and smallest
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }

            // Ask user if they want to continue
            System.out.println("Do you want to enter another number? (y/Y for yes, n/N for no): ");
            char choice = sc.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                break; // Exit the loop
            }
        }

        // Print the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }

}

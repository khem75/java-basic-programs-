import java.util.Arrays;
import java.util.Scanner;

public class SecondMinMaxAverage {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] array = new int[n];

        // Fill the array with input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array to find the second smallest and second largest values
        Arrays.sort(array);

        // Ensure the array has at least two distinct elements
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
        } else {
            // Get second minimum and second maximum
            int secondMin = array[1]; // Second smallest element
            int secondMax = array[n - 2]; // Second largest element

            // Calculate the average
            double average = (secondMin + secondMax) / 2.0;

            // Print the result
            System.out.println("The second minimum is: " + secondMin);
            System.out.println("The second maximum is: " + secondMax);
            System.out.println("The average of second minimum and second maximum is: " + average);
        }

        // Close the scanner
        sc.close();
    }
}

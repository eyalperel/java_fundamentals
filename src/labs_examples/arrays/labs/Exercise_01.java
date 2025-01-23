package labs_examples.arrays.labs;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args){
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        // Declare an array to store 10 numbers
        int[] nums = new int[10];
        int sum = 0;
        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");
        // Use a for loop to read the numbers and calculate the sum
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();  // Store the number in the array
        }
        // Use another for loop to calculate the sum of the numbers
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];  // Add each number to the sum
        }
        // Calculate the average
        double average = sum / 10.0;

        // Display the sum and average
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        // Close the scanner
        scanner.close();
    }

}
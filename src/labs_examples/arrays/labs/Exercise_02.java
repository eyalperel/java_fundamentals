package labs_examples.arrays.labs;
import java.util.Scanner;
import java.util.Arrays;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1-10:");
        int target = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("The index of the number you typed (" + target + ") in the array is: " + i);
                break;
            }
        }
    }
}
package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double volume = 3.14 * 3.14 * 3.14 * 5;
        double area = 2 * 3.14 * 3.14 * 5 + 2 * 3.14 * 3.14 * 3.14;
        System.out.println(volume);
        System.out.println(area);
    }
}
package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args){
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Every other element in reverse order:");

        for (int i = array.length - 1; i >= 0; i -= 2){
            System.out.println(array[i] + " ");
        }
    }

}

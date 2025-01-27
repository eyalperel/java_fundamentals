package labs_examples.arrays.labs;
import java.util.ArrayList;


/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));
        System.out.println("Last fruit: " + fruits.get(fruits.size() - 1));
    }
}



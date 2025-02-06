package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {
        System.out.println(multiply(3, 5));
        System.out.println(divide(6, 3));
        joke();
        System.out.println(yearsToSec(5));
        System.out.println(varargs(1,2,3,4,5));

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int  multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke() {
        System.out.println("Who's there? No one - jajaja");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsToSec(int years) {
        return years * 12 * 30 * 24 * 60 * 60;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargs(int... numbers) {
        return numbers.length;
    }





}

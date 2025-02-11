package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    private int number;
    private double doub;

    public MethodTraining() {
        this.number = 3;
        this.doub = 7.52;
    }

    public void display() {
        System.out.println("Number: " + number + " , Double: " + doub);
    }

    public void display(int number) {
        System.out.println("Overloaded: Number = " + number);
    }

    public void display(int number, double doub) {
        System.out.println("Overloaded: Number = " + number + ", Double = " + doub);
    }
}

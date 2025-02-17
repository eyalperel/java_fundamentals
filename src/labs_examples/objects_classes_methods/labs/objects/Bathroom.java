package labs_examples.objects_classes_methods.labs.objects;

public class Bathroom {
    private Boolean isClean;
    private Boolean isOccupied;

    public Bathroom () {
        this.isClean = true;
        this.isOccupied = false;
    }

    public String toString() {
        return "Properties of Bathroom:\n" + "Clean? " + this.isClean + "\n" + "Occupied? " + this.isOccupied;
    }
}

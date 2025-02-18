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

    public void setClean(Boolean clean) {
        isClean = clean;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Boolean getClean() {
        return isClean;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }
}

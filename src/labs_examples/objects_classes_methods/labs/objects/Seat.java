package labs_examples.objects_classes_methods.labs.objects;

public class Seat {
    private double height;
    private String material;

    public Seat() {
        this.height = 1;
        this.material = "Crap";
    }

    public String toString() {
        return "Properties of seat:\n" + "Height: " + this.height + "\n" + "Material: " + this.material;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }
}

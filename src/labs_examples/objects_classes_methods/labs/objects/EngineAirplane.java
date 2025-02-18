package labs_examples.objects_classes_methods.labs.objects;

public class EngineAirplane {
    private double horsePower;
    private double hoursOperated;

    public EngineAirplane (double horsePower) {
        this.horsePower = horsePower;
        this.hoursOperated = 0;
    }

    public String toString() {
        return "Properties of engine\n" + "Horsepower: " + this.horsePower + "\n" + "Hours Operated: " + this.hoursOperated;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setHoursOperated(double hoursOperated) {
        this.hoursOperated = hoursOperated;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getHoursOperated() {
        return hoursOperated;
    }
}

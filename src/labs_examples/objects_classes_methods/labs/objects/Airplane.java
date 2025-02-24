package labs_examples.objects_classes_methods.labs.objects;


public class Airplane {
    private double fuelCapacity;
    private double currentFuelLevel;
    private Seat seat;
    private EngineAirplane engine;
    private Bathroom toilet;
    private Door door;

    public Airplane(double capacity, double level, Seat seat, EngineAirplane engine, Bathroom bathroom, Door door) {
        this.fuelCapacity = capacity;
        this.currentFuelLevel = level;
        this.seat = seat;
        this.engine = engine;
        this.toilet = bathroom;
        this.door = door;
    }

    public String toString() {
        return "Airplane: \n" +
                "engine=" + engine.toString() +
                ",\n seat=" + seat.toString() +
                ",\n toilet ='" + toilet.toString() +
                ",\n door ='" + door.toString() + '\'' +
                '}';
    }

}


package labs_examples.objects_classes_methods.labs.objects;

public class AirPlaneExample {
    public static void main(String[] args) {
        Door myDoor = new Door();
        EngineAirplane myEngine = new EngineAirplane(100);
        Seat mySeat = new Seat();
        Bathroom myhBathroom = new Bathroom();
        Airplane myAirplane = new Airplane(100, 1000, mySeat, myEngine, myhBathroom, myDoor);

        System.out.println(myAirplane.toString());
    }
    
}

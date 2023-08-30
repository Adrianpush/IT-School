package session10.homework.vehicle.hierarchical_inheritance;

public class FishingBoat extends Boat {

    double fishCapacity;
    String typeOfNet;

    public FishingBoat(double length, double weight, double fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("Fishing boat is casting it's net.");
    }
}

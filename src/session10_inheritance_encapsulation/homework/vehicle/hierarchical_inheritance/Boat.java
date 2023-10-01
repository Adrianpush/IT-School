package session10_inheritance_encapsulation.homework.vehicle.hierarchical_inheritance;

public class Boat {

    double length;
    double weight;

    public Boat(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail() {
        System.out.println("Boat is sailing");
    }
}

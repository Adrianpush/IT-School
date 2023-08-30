package session10.homework.vehicle.boats;

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

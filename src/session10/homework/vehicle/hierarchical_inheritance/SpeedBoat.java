package session10.homework.vehicle.hierarchical_inheritance;

public class SpeedBoat extends Boat {

    int maxSpeed;
    String engineType;

    public SpeedBoat(double length, double weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost() {
        System.out.println("Speed boat activated turbo boost.");
    }
}

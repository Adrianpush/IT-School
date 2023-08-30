package session10.homework.vehicle.single_inheritance;

public class Bicycle {

    int speed;
    int gear;
    final int ACCELERATION = 2;
    final int BREAKING_POWER = 5;

    public Bicycle() {
        this.speed = 0;
        this.gear = 1;
    }

    public void speedUp() {
        speed += ACCELERATION;
    }

    public void brake() {
        if (this.speed >= BREAKING_POWER) {
            this.speed -= BREAKING_POWER;
        } else {
            this.speed = 0;
        }
    }

    public void changeGear(Direction direction) {
        if (direction.equals(Direction.UP) && gear < 5){
            gear++;
        } else if (gear > 1) {
            gear--;
        }
    }
}

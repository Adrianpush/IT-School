package session10.homework.vehicle.bicycles;

public class Bicycle {

    int speed;
    int gear;

    public Bicycle() {
        this.speed = 0;
        this.gear = 1;
    }

    public void speedUp() {
        this.speed += 2;
    }

    public void brake() {
        if (this.speed > 5) {
            this.speed -= 5;
        } else if (this.speed > 0) {
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

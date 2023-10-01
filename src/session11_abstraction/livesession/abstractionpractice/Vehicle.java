package session11_abstraction.livesession.abstractionpractice;

public abstract class Vehicle implements Safety{

    private double speed;

    protected double getSpeed() {
        return speed;
    }

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    protected abstract void start();
    public final void stop() {
        setSpeed(0);
    }

    @Override
    public void deployAirbags() {

    }

    @Override
    public void deployAntiLockBreaks() {

    }
}

interface Safety {

    void deployAirbags();
    void deployAntiLockBreaks();
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Start the engine.");
    }
}

class Bicycle extends Vehicle {

    @Override
    public void start() {
        System.out.println("Start peddling!");
    }
}

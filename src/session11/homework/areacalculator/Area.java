package session11.homework_fun.areacalculator;

public class Area extends Shape {

    @Override
    protected double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    protected double squareArea(double length) {
        return length * length;
    }

    @Override
    protected double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

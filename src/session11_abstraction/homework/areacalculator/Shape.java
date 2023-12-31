package session11_abstraction.homework.areacalculator;

abstract class Shape {

    protected abstract double rectangleArea(double length, double breadth);

    protected abstract double squareArea(double length);

    protected abstract double circleArea(double radius);
}

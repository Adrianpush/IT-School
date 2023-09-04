package session11.livesession.abstractionpractice;

public abstract class Shape {

    abstract double area();

    abstract double perimeter();

    String getShapeName() {
        return getClass().toString();
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    double perimeter() {
        return 0;
    }
}

class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

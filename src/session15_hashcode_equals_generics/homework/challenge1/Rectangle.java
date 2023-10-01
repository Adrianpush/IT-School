package session15_hashcode_equals_generics.homework.challenge1;

import java.util.Objects;


//Implement the equals()and hashCode()methods for a Rectangle class with width and height fields.
//Test that two instances with the same width and height return true for equals()and have the same hash code.

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20, 5);
        Rectangle rectangle2 = new Rectangle(21, 5);
        Rectangle rectangle3 = new Rectangle(20, 5);

        System.out.println(rectangle1.equals(rectangle1));
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.equals(rectangle3));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle that)) return false;
        return Double.compare(width, that.width) == 0 && Double.compare(height, that.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}

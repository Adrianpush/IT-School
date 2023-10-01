package session11_abstraction.homework.areacalculator;

public class Main {

    public static void main(String[] args) {
        Shape area = new Area();
        System.out.println(area.rectangleArea(10, 2));
        System.out.println(area.squareArea(5));
        System.out.println(area.circleArea(Math.PI));
    }
}
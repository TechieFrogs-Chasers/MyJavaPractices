package Interfaces;


interface Shape {
    void shapeDrawing();

    double getTotalArea();

    public boolean fitText(String textmessage);
}

class Circles implements Shape {
    float radius;
    String color;

    @Override
    public void shapeDrawing() {
        System.out.println("Shape Drawing!");
    }

    @Override
    public double getTotalArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean fitText(String textmessage) {
        return textmessage.length() < (2 *radius);
    }
}
class Rectangles implements Shape{
    double length,width;
    String color;

    @Override
    public void shapeDrawing() {

    }

    @Override
    public double getTotalArea() {
        return 0;
    }

    @Override
    public boolean fitText(String textmessage) {
        return false;
    }
}

public class Shape_9 {
}

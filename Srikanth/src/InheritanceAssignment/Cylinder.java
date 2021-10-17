class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public cirlce(double radius,String color){
        this.radius = radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle-[radius=" + radius + ",color= " + color + "].";
    }
}

class Cylinder extends Circle {
    private double height = 1.0;

    public double getheight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;

    }

    public double getvolume() {
        return super.getArea() * height;
    }

    public double getArea() {
        super.getArea();
        return (2 * Math.PI * getRadius() * height) + (2 * getRadius() * getRadius());
    }

}

public class TestCylinder {
    public static void main(String[] args) {

        Cylinder obj = new Cylinder();

        System.out.println("Radius: " + obj.getRadius());
        System.out.println("Height: " + obj.getHeight());
        System.out.println("color: " + obj.getColor());
        System.out.println("Area: " + obj.getArea());
        System.out.println("volume: " + obj.getvolume());
        System.out.println(obj.toString() + "\n");

        Cylinder obj1 = new Cylinder(6.0, 4.0, "yellow");

        System.out.println("Radius: " + obj1.getRadius());
        System.out.println("Height: " + obj1.getHeight());
        System.out.println("color: " + obj1.getColor());
        System.out.println("Area: " + obj1.getArea());
        System.out.println("volume: " + obj1.getvolume());
        System.out.println(obj1.toString());
    }
}

package Inheritance;//Package

class CircleClass {//Super class
    double radius;
    String color;

    public CircleClass() {//Constructor
        double radius = 1.0;
        String red = "red";
    }

    public CircleClass(double radius) {//Constructor with one parameretized
        this.radius = radius;
    }

    public CircleClass(double radius, String color) {//Constructor with two parameretized
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){//method
        return radius;
    }
    public void setRadius(double radius){
         this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return "Circle [radius = " + radius + " color = " + color + "]";
    }
}
class Cylinder extends CircleClass{//subclass
    private double heigth=1.0;//private variable

    public double getHeigth() {//getter
        return heigth;
    }

    public void setHeigth(double heigth) {//setter
        this.heigth = heigth;
    }

    public Cylinder(){//constructor
        super();
        this. heigth=1.0;
    }
    public Cylinder(double radius){//Constructor with one parameretized
        super();
        this.radius=radius;
    }
    public Cylinder(double radius,double heigth){//Constructor with two parameretized
        super(radius);
        this.heigth=heigth;
    }
    public Cylinder(double radius,double heigth,String color){//Constructor with three parameretized
        super(radius,color);
        this.color=color;
    }
    public double getVolume(){
        return super.getArea()*heigth;
    }
    public double getArea(){
        super.getArea();
        return (2*Math.PI*getRadius()*heigth)+(2*getRadius()*getRadius());
    }
}
public class CircleCylinder {//Driver class
    public static void main(String[] args) {//main method

        Cylinder cylinderObj=new Cylinder();//Instance for subclass

        System.out.println("Raidus: "+ cylinderObj.getRadius());
        System.out.println("Heigth: "+ cylinderObj.getHeigth());
        System.out.println("Color: "+ cylinderObj.getColor());
        System.out.println("Area: "+ cylinderObj.getArea());
        System.out.println("Volume: "+ cylinderObj.getVolume());
        System.out.println(cylinderObj.toString());

        Cylinder cylinderObj1 = new Cylinder(7.0, 5.0, "Green");

        System.out.println("Radius: " + cylinderObj1.getRadius());
        System.out.println("Heigth: " + cylinderObj1.getHeigth());
        System.out.println("color: " + cylinderObj1.getColor());
        System.out.println("Area: " + cylinderObj1.getArea());
        System.out.println("volume: " + cylinderObj1.getVolume());
        System.out.println(cylinderObj1.toString());
    }
}

package assignment3;

public class Eleven {
    
}
class Circle{
String color ="red";
double radius=1.0d;
double area;
Circle(){

}

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color){
        this.color=color;
        this.radius=radius;

    }
    double getArea(){
        double area = 3.14*(radius*radius);
        return area;

    }

}
class Cylinder extends Circle{
    double height=1.0d;
    Cylinder(){

    }
    Cylinder(double radius){

    }
    Cylinder(double radius, double height){

    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }

    Cylinder(double radius, double height,String color){

    }
    void getVolume(){

    }


}
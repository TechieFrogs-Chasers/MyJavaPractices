package assignment3;

public class TestCylinder {
    public static void main(String[] args) {
        //Circles obj = new Circles(2);
        //Cylinder obj2 = new Cylinder(2,3,"pink");
        Cylinder obj2 = new Cylinder(2,3);
      
        //System.out.println( " the area of cylinder is: "  + obj2.getArea());  
        obj2.getVolume(); 
        System.out.println("The area of cylinder: "+ obj2.getArea());
    }  
}
class Circles{
String color ="red";
double radius;
    Circles(){

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
    Circles(double radius){
        this.radius = radius;
    }
    Circles(double radius, String color){
        this.color=color;
        this.radius=radius;
    }
    double getArea(){
        double area = 3.14*(radius*radius);
        System.out.println(" the area of circle: " + area);
        return area;
    }
    public String toString(){
        return "circle[color = c, radius = r]";
    }
}
class Cylinder extends Circles{
    double height;
    Cylinder(){    
        }   
    Cylinder(double radius){
        super(radius);
        }
    Cylinder(double radius, double height){
        this.height= height;
        super.radius= radius;      
        }
    Cylinder(double radius, double height,String color){
        super.radius= radius;
        this.height= height;
        super.color=color;
        }
    public void setHeight(double height) {
        this.height = height;
        }
    public double getHeight() {
        return this.height;
        }
    void getVolume(){
        double volume = height*super.getArea();
        System.out.println("The volume of the cylinder is : " + volume);
        }
    double getArea(){
        double area = (2*3.14* getRadius()* getHeight())+(2*super.getArea());
        return area;
}
}
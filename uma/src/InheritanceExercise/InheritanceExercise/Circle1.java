package InheritanceExercise;

public class Circle1 {

    double radius =12.0;
    String color;
   
    Circle1(){

        System.out.println("circle");
    }
    Circle1(double radius){
        super();
        System.out.println(this.color+"  "+this.radius);
    }
    Circle1(double radius,String color){
 
        

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    double getArea(){

        double area = 3.14*(radius*radius);
        System.out.println(area);
        return 10.0;
    }
    /* String toString(){
        return color;
    }*/
    
}

class Cylinder extends Circle1{

    double height;

     Cylinder(){

        super(10.0);
        System.out.println("cylinder");
    }
     Cylinder(double radius){

        
       
    }
    Cylinder(double radius,double height,String color){

        
    }
    Cylinder(double radius,double height){

        
    }
      double getVolume(){

        return 1.0;
    }


    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    double getArea(){
    
     double surfaceArea =((radius*height)*2*3.14);
        System.out.println(surfaceArea);
        return 10.0;
    }


    public static void main(String[] args) {

      Cylinder objCylinder = new Cylinder();

      objCylinder.getArea();
        
    }


}
class Test{
    public static void main(String[] args) {
        
        Circle1 objCircle = new Circle1();
        objCircle.getArea();

        Cylinder objCylinder = new Cylinder();

      objCylinder.getArea();
    }
}

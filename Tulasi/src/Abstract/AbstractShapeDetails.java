package Abstract;//Package

abstract class Shapeabstract {//abstract class
    protected String color;//protected variables
    protected boolean filled;

    Shapeabstract() {//Constructor
        String color = "red";
        boolean filled = true;
    }

    Shapeabstract(String color, boolean filled) {//Constructor with two parameters in abstract class
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {//String method in abstract class-first method in abstract class
        return color;
    }

    public void setColor(String color) {//Second method in abstract class
        this.color = color;
    }

    public boolean isFilled() {//third method in abstract class
        return true;
    }

    public void setFilled(boolean filled) {//fourth method in abstract class
        this.filled = true;
    }

    public String toString() {//fifth method in abstract class
        return "Shapeabstract[color= " + color + ", filled= " + filled + "]";
    }

    abstract double getArea();//abstract method

    abstract double getPerimeter();//abstract method
}

class Circleabstract extends Shapeabstract {//subclass for circleabstract
    double radius;

    Circleabstract() {//Constructor
        double radius = 1.0;
    }

    Circleabstract(double radius) {//Constructor with one parameter
        //super();
        this.radius = 1.0;
    }

    Circleabstract(double radius, String color, boolean filled) {//Constructor with three parameters
        super(color, filled);
        this.color = color;
        this.filled = filled;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "Circleabstract[Shapeabstract[color= ,filled=  ],length= ]";
    }
}

class Rectangleabstract extends Shapeabstract {//subclass for Rectangleabstract
    double width;
    double length;

    Rectangleabstract(){//Constructor
        double width=1.0;
        double length=1.0;
    }

    Rectangleabstract(double width,double length){//Constructor with two parameters
        this.width=1.0;
        this.length=1.0;
    }
    Rectangleabstract(double width,double length,String color,boolean filled){//Constructor with four parameters
        super(color,filled);
        this.color=color;
        this.filled=filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return 2*(width+length);
    }

    public String toString(){
        return "Rectangleabstract[Shapeabstract[color= ,filled=  ,width=  ,length=  ]]";
    }

}

class Squareabstract extends Shapeabstract{

     double side;
    Squareabstract(){

    }
    Squareabstract(double side){
        this.side=side;
    }
    Squareabstract(double side,String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    public void setWidth(double width){
        this.side=width;
    }
    public void setLength(double length){
        this.side=length;
    }
    public String toString(){
        return "Sqareabstract[Rectangleabstract[Shapeabstract[color= ,filled=  ,width=  ,length=  ]]";
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

}

public class AbstractShapeDetails {//Driver class

    public static void main(String[] args) {//main method

        Circleabstract circleAbstractObj=new Circleabstract();
        System.out.println("Area of Circle : " + circleAbstractObj.getArea());
        System.out.println("perimeter of circle : " + circleAbstractObj.getPerimeter());

        Circleabstract circleAbstractObj1 = new Circleabstract(5.0);
        System.out.println("Area of Circle : " + circleAbstractObj1.getArea());
        System.out.println("perimeter of circle : " + circleAbstractObj1.getPerimeter());


        Circleabstract circleAbstractObj2 = new Circleabstract(6, "Black", false);
        System.out.println("Area of Circle : " + circleAbstractObj2.getArea());
        System.out.println("perimeter of circle : " + circleAbstractObj2.getPerimeter());
        System.out.println("color : " + circleAbstractObj2.getColor());
        System.out.println("filled : " + circleAbstractObj2.isFilled());

        Rectangleabstract rectangleAbstractObj = new Rectangleabstract();
        System.out.println("Area of Rectangle : " + rectangleAbstractObj.getArea());
        System.out.println("Perimeter of rectangle : " + rectangleAbstractObj.getPerimeter());

        Rectangleabstract rectangleAbstractObj1 = new Rectangleabstract(3.5, 5.5);
        System.out.println("Area of Rectangle : " + rectangleAbstractObj1.getArea() );
        System.out.println("Perimeter of rectangle : " + rectangleAbstractObj1.getPerimeter());

        Rectangleabstract rectangleAbstractObj2 = new Rectangleabstract(3.15, 5.25, "Yellow", true);
        System.out.println("Area of Rectangle : " + rectangleAbstractObj2.getArea());
        System.out.println("Perimeter of rectangle : " + rectangleAbstractObj2.getPerimeter());
        System.out.println("color : " + rectangleAbstractObj2.getColor() );
        System.out.println("filled : " + rectangleAbstractObj2.isFilled());

        Squareabstract squareAbstractObj = new Squareabstract();
        System.out.println("Area using Square obj: "+ squareAbstractObj.getArea());
        System.out.println("Perimeter using Square obj: "+ squareAbstractObj.getPerimeter());

    }
}

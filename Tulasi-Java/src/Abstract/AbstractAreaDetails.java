package Abstract;//Package

abstract class Shape {//abstract class
    abstract double RectangleArea(float length, float breadth);//abstract method with two parameters

    abstract double SquareArea(float side);//abstract method with one parameters

    abstract double CircleArea(float radius);//abstract method with one parameters
}

class Area extends Shape {//subclass
    double RectangleArea(float length, float breadth) {//first method in subclass
        return length * breadth;

    }

    double SquareArea(float side) {//second method in subclass

        return side * side;
    }

    double CircleArea(float radius) {//third method in subclass
        return 3.14 * radius * radius;//Formula for area of a circle-A=Pi*r*r=3.14*r*r
    }
}

public class AbstractAreaDetails {//Driver class
    public static void main(String[] args) {//main class
        Area areaObj = new Area();//Instance for subclass
        System.out.println(areaObj.CircleArea(9));//call first method
        System.out.println(areaObj.SquareArea(6));//call second method
        System.out.println(areaObj.RectangleArea(9, 7));//call third method
    }
}

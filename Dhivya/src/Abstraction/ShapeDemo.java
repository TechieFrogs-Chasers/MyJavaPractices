package Abstraction;

public class ShapeDemo {   
    public static void main(String[] args) {
        Area areaObj = new Area();
        System.out.println(areaObj.rectangleArea(10, 8));
         System.out.println(areaObj.squareArea(4));
         System.out.println(areaObj.circleArea(9));

    }
}
abstract class Shape{
    abstract int rectangleArea(int l,int b);
    abstract int squareArea(int s);
    abstract double circleArea(int r);
}
class Area extends Shape{
    int rectangleArea(int l,int b)
    {   int area = l*b;
        return area;
    }
    int squareArea(int s)
    {   int area = s*s;
        return area;
    }
    double circleArea(int r)
    {   double area = 3.14*r*r;
        return area;
    }
    
}
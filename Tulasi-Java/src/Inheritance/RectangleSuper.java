package Inheritance;//Package

class RectangleClass{//Super class
    int length, breadth;

    void area() {//method for superclass
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    void perimeter() {//method for superclass
        int perimeter = (length + breadth) * 2;
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }

    RectangleClass(int length, int breadth) {//Constructor for superclass
        this.length = length;
        this.breadth = breadth;
    }
}
class SquareClass extends RectangleClass{//Subclass
  int side;
    SquareClass(int side) {//Constructor for subclass
        super(5,6);
        this.side=side;
    }
    public void area(){//method for subclass
        super.area();
        int area=side*side;
        System.out.println("Area of the square: "+ area);
    }
    public void Perimeter() {//method for subclass
        super.perimeter();
        int Perimeter = 4 * side;
        System.out.println("Perimeter Of The Square: " + Perimeter);
    }
}
public class RectangleSuper {//Driver class
    public static void main(String[] args) {//main method
        SquareClass squObj = new SquareClass(6);//Instance of subclass
        squObj.area();//call method
        squObj.Perimeter();//call method
    }
}
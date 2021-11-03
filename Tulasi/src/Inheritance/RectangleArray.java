package Inheritance;
class RectangleClassArray{//Super class
    int length, breadth;

    void area() {//method for superclass
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    void perimeter() {//method for superclass
        int perimeter = (length + breadth) * 2;
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }

    RectangleClassArray(int length, int breadth) {//Constructor for superclass
        this.length = length;
        this.breadth = breadth;
    }
}
class SquareClassArray extends RectangleClassArray{//Subclass
    int side;
    SquareClassArray(int side) {//Constructor for subclass
        super(5,6);
        this.side=side;
    }
    public void area(){//method for subclass
        super.area();
        int area=side*side;
        System.out.println("Area of the square: "+ area);
    }
    public void perimeter() {//method for subclass
        super.perimeter();
        int perimeter = 4 * side;
        System.out.println("Perimeter Of The Square: " + perimeter);
    }
}

public class RectangleArray {//Driver class
    public static void main(String[] args) {//main method
        SquareClassArray[] squareClassArrayObj=new SquareClassArray[10];//Array
        for (int num=0;num<10;num++){
            squareClassArrayObj[num]= new SquareClassArray(num+4);
            squareClassArrayObj[num].area();
            squareClassArrayObj[num].perimeter();
        }

    }
}


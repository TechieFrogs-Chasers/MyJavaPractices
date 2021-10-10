package InheritanceAssignment;

class RectanglePractice {
    int length, breadth;

    void area() {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }

    void perimeter() {
        int perimeter = (length * breadth) * 2;
        System.out.println("Periemter of rectangle: " + perimeter);
    }

    RectanglePractice(int lenght, int breadth) {
        this.length = lenght;
        this.breadth = breadth;
    }
}

class Square extends RectanglePractice {
    int side;

    Square(int side) {
        super(6, 6);
        this.side = side;
    }

    public void area() {
        super.area();
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    public void perimeter() {
        super.perimeter();
        int perimter = 4 * side;
        System.out.println("Perimeter of square:" + perimter);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Square sobj = new Square(6);
        sobj.area();
        sobj.perimeter();
    }
}

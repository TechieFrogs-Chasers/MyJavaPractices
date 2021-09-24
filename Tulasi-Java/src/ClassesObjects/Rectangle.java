package ClassesObjects;

public class Rectangle {//class
    int lenght, breadth;

    public static void main(String[] args) {//main method
        new Rectangle(4, 5);//call constructor
        new Rectangle(5, 8);
    }

    void area(int l, int b) {//method
        System.out.println("Area of rectangle with lenght " + l + " " + "and breadth " + b + " " + ":" + " " + l * b);
    }

    Rectangle(int l, int b) {//Constructor
        lenght = l;
        breadth = b;
        area(l, b);
    }
}




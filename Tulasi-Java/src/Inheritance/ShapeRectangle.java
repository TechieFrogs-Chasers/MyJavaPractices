package Inheritance;//Package

class Shape {//
    void methodshape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void methodRectangle() {
        System.out.println("This is rectangular shape");
    }

}

class Circle extends Shape {
    void methodCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void methodSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class ShapeRectangle {
    public static void main(String[] args) {
        Square mySquareObj = new Square();
        mySquareObj.methodshape();
        mySquareObj.methodRectangle();

    }
}

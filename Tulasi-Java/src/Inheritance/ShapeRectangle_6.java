package Inheritance;//Package

class Shape {//Super class
   public void methodShape() {//Method for superclass
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {//Subclass extends superclass

    public void methodRectangle() {//method for rectangle subclass
        System.out.println("This is rectangular shape");
    }

}

class Circle extends Shape {//Subclass extends superclass
   public void methodCircle() {//method for circle subclass
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {//Subclass extends Superclass

    public void methodSquare() {//method for Square subclass
        System.out.println("Square is a rectangle");
    }


}
public class ShapeRectangle_6 {//Driver class
    public static void main(String[] args) {//main method
        Square mySquareObj = new Square();//On creating last subclass instance we can call all above subclass methods
        mySquareObj.methodShape();//call method
        mySquareObj.methodRectangle();//call method

    }
}

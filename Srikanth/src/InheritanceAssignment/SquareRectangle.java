package InheritanceAssignment;

class Square1 {
    public void shape() {
        System.out.println("This is shape.");
    }
}

class Rectangle1 extends Square1 {
    public void rectangular() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Square1 {
    public void circular() {
        System.out.println("This is circular shape.");
    }

}

class Square22 extends Rectangle1 {
    public void method() {
        System.out.println("Square is a rectangle.");
    }
}

public class SquareRectangle {
    public static void main(String[] args) {
        Square22 sobj = new Square22();
        sobj.method();
        sobj.shape();
        sobj.rectangular();
    }
}
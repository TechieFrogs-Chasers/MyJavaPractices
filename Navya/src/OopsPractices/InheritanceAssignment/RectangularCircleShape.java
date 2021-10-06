package OopsPractices.InheritanceAssignment;

class Shape{
    void ShapeDisplay(){
        System.out.println("This is Shape");
    }
}
class Rectangle1 extends Shape{
     public void RectangularDisplay(){
        System.out.println("This is Rectangle Shape");
    }
}
class Circle extends Shape{
    void CircularDispaly(){
        System.out.println("This is Circle Shape");
    }
}
class Square1 extends Rectangle1{
      void squareDisplay(){
          System.out.println("Square is a rectangle");
      }
}
public class RectangularCircleShape {
    public static void main(String[] args) {
        Square1 squareObj = new Square1();
        squareObj.ShapeDisplay();
        squareObj.RectangularDisplay();
    }
}

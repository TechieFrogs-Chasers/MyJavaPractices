package InheritanceExercise;

public class Shape {


    void display(){
        System.out.println("This is shape");
    }


}

class Rectangle extends Shape{

    void show (){
        System.out.println("This is rectangle");
    }

}
class Circle extends Shape{

    void show_1(){
        System.out.println("This is circle");
    }

}
class Square extends Rectangle{


    void show1(){
        System.out.println("Square is a Rectangle");
    }

    public static void main(String[] args) {

        Square objSquare = new Square();
        objSquare.display();
        objSquare.show();
        
    }
}
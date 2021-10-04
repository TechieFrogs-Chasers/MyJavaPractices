package assignment3;
// example for 
public class Six {
    public static void main(String[] args) {
        System.out.println("    OUTPUT:");
        Square1 obj = new Square1();
        obj.printMethod();
    }
}
class Shape{
void Method()
{
    System.out.println("This is Shape:");
}
}
class Rectangle1 extends Shape{
    void display(){
    super.Method();
    System.out.println("This is Rectangle shape");
}
}
class Square1 extends Rectangle1{
    void printMethod(){
        super.display();
    System.out.println("Square is a Rectangle");
    }
}

class Circle extends Shape{
void method(){
    System.out.println("This is Circle shape");
}
}

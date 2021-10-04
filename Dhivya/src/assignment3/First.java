package assignment3;  /* this program is to define that parent class method 
could be accessed using subclass object*/

public class First {
    void Method(){
        System.out.println("This is parent class:");
    }
    public static void main(String[] args) {
        First obj = new First();
        Child obj2 = new Child();
        obj.Method();
        obj2.display();
        obj2.Method();

    }
}
class Child extends First{
    void display(){
        System.out.println("This is child class");
    }
}
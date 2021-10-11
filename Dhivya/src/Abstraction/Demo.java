package Abstraction;
public class Demo {   
public static void main(String[] args) {
    SubA obj1 = new SubA();
    SubB obj2 = new SubB();
    obj1.messege();
    obj2.messege();
}
}
abstract class Parent{
    void messege(){
        System.out.println("This is Parent Class");
    }
}
class SubA{
    void messege(){
        System.out.println("This is First subclass");
    }
}
class SubB{
    void messege(){
        System.out.println("This is second subclass");
    }
}

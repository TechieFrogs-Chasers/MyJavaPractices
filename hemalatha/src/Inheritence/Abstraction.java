package Inheritence;

abstract class Abstraction {    //abstract class
    public void display(){
        System.out.println("display method");
    } 
    Abstraction(){
        System.out.println("parent class constructor");
    }
    public abstract void myMethod();   //abstract method
}
class Demo extends Abstraction{
    public void myMethod(){
        System.out.println("another method");
    }
    Demo(){
        System.out.println("Constructor in subclass");
    }

public static void main(String[] args) {
    Abstraction obj = new Demo();
    obj.myMethod();
    obj.display();


}

    
    
}

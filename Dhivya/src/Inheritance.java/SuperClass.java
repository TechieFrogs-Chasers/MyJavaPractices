//package Inheritance.java;    Example for Single Inheritance:

public class SuperClass {           // Parent or Superclass
    String name1 = "Superclass";
    int age = 25;
    SuperClass(){
        System.out.println("Inside the parent class constructor:");
    }
    void superClassMethod(){
        System.out.println("Inside the parent class Method:");
    }  
}

class Subclass extends SuperClass{          // Child or Subclass
    int a = 10;
    String name = "Dhivya";
Subclass(){
    System.out.println(" Inside the child class constructor: ");
}
void subClassMethod(){
    System.out.println("Inside the child class method: ");
}
public static void main(String[] args) {        //Mainclass
    System.out.println("The output for Single Inheritance: ");
    Subclass obj = new Subclass();
    obj.subClassMethod();    
    obj.superClassMethod();
    System.out.println("The name given in Subclass:" + obj.name );
    System.out.println("The name given in Supeclass:" + obj.name1);   
}

}
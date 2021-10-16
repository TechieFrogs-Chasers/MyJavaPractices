//package Inheritance.java;    Example for Single Inheritance:

public class SuperClass {           // Parent or Superclass or base class
    static String name = "Superclass";
    int age = 25;
    SuperClass(){
        System.out.println("Inside the parent class constructor:");
    }
    void superClassMethod(){
        System.out.println("Inside the parent class Method:");
    }  
}

class Subclass extends SuperClass{          // Child or Subclass or derived or extended class
    int a = 10;
    String name = "Dhivya";
Subclass(){
    System.out.println("Inside the child class constructor: "+ name + super.name);
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
    //System.out.println("The name given in Subclass:" + super.name );here we cant use super or this to call the variables
    //bcz, from static main method we cant access variables using this or super keywords

}

}
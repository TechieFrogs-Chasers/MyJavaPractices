package Interfacefolder;

public interface DemoInterface {
    int a=10;
    String name ="Demo1";
    int age = 25;
    float f = 6.14f;
    void display();
    void messege();
    static void statictMethod(){
        System.out.println(" In Default method of the Interface: ");
    }
    default void defaultMethod(){
        System.out.println(" In Default method of the Interface: ");
    }
    public static void main(String[] args) {
        System.out.println("In main method of interface:");
        statictMethod();
      //  DemoInterface.defaultMethod(); we could access only the static method of the interface.
      // not able to access the default method i.e the method created with keyword "default"
      
    }
}

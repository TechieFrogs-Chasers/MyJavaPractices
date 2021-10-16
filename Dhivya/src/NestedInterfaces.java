

public class NestedInterfaces {   //main public class
    int x= 20;
     public static void main(String[] args) {
        NestedInterfaces obj = new NestedInterfaces();
         obj.display(); // normal method inside a class.
         NestedInterfaces.NestInterface1.staticMethod();
         System.out.println("the value of the variables od interface:" );
         //((NestedInterfaces.NestInterface1) obj).defaultMethod(); // what kind of syntax is this?
     }
// nested interface inside a class which cotains one abstract,static & default method.
     interface NestInterface1{    
         int a =250;
         String name = " First_interface";
         void test(); //abstract method
          default void defaultMethod(){  // default method
             System.out.println("In default methd of nested interface");
         }
         static void staticMethod(){  //static method
            System.out.println("In static method of nested interface");
         } 
         public static void main(String[] args) {  // main method inside a nested interface
            NestedInterfaces obj2 = new NestedInterfaces();
             System.out.println("the value of x is :" + obj2.x);
         }
        }  
         public void display(){ //normal method of a class.
             System.out.println("In the normal method of the class");
         }
     }

class Nested2 implements  NestedInterfaces.NestInterface1{  // It's possible to implement a interface which is declared 
//inside another class by referring to the "classname.interfacename"
// To access its methods just create object for the class which implements the interface, not for the class which
//contains the interface.
public static void main(String[] args) {
    NestedInterfaces obj = new NestedInterfaces(); // object for The class that contains the interface
    Nested2 newobj = new Nested2(); //object for The class that implements the interface
    obj.display();
    newobj.test();
   newobj.defaultMethod(); // only the implementing class can access the default method of the interface.
   Nested2.staticMethod(); //to access the overridden static method of the interface, refer the obj of the class
   NestedInterfaces.NestInterface1.staticMethod();// static method of the interface can be accessed by referring 
  // "classname.interface name.staticmethod name();"
   
   
}
    @Override
    public void test() {
        System.out.println("Interface method implemented in class");
    }
    public void defaultMethod(){
        System.out.println("Inside the class -overridden interface default method ");
    }
    static void staticMethod(){
       // NestInterface1.super.staticMethod();// this throws error, bcz the interface is inside a class.
        System.out.println("Inside the class -overridden interface static method ");
    }

}
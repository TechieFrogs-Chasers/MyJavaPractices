package OopsConcepts;

public interface MyInterface1 {
    String name="uma";
    int a = 50;

    // in interface , abstract , default, private and static methods are allowed

    void hello();     // abstract method

   // default void hello(){  // same method name is not allowed

   // }

    default void hello(int i){        // default method with same name but with parameters(method overloading)
    System.out.println("default method");
    }

    static void hello(String name){    // static method
    System.out.println("static method");
    }

   // private void get(){ //  only local

   // }

   //protected void hi(); // protected is not allowed
}
interface Interface2{

    static private void get(){    // can be used only locally ,can not be inherited or implemented

        System.out.println("static private");
    }

    //static void hello(){   // duplicate static  method in the MyInterface1 

   // }

   //default void hello(int i){ // allows duplicate default methods in own interface but not allowed in the implemented class

   //}
  // default void hello(){  //duplicate method not allowed

   //}

   

    public static void main(String[] args) {
        Interface2.get();
    }

    void hello();

    int a =100;
}
interface Interface3{

    void hello();
 
    int a=10;
    double salary =100.00;
}

interface Son extends MyInterface1,Interface2,Interface3,Interface{   //  multiple inheritance


    public static void main(String[] args) {

      //MyInterface1.name="uma"; // "name can not be assigned" error
    
     System.out.println(name);

     int a=200;
     System.out.println(a);  // there are 3 values for "a", but only local value willbe printed first

     System.out.println(Interface3.a+"  "+MyInterface1.a+"  "+Interface2.a+" "+a);

     
    }

}
     //interface Son10  implements MyInterface1,Interface2{   //error "permits expected",interface can not implement another interface
    
     //interface can only extend  interfaces



    class Democlass implements Son{

     public void hello(){

     }
     
     public void display(){

     }

    
      public static void main(String[] args) {
          Democlass objDemoclass = new Democlass();
          objDemoclass.hello();

       // MyInterface1.super.hello();
          
    
      }
  }

 // interface with single abstract method is called functional interface
 // interface with no fields or methods is called tag/ marker interface
 
interface Single{
    void one();

    default void two(){

    }
}    


  


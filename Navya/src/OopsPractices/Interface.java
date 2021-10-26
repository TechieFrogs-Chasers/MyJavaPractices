package OopsPractices;

import java.util.Comparator;

class MyInterface{
    interface message {
        void msg();
    }
}
 interface Interface1{
    void display();
    int i = 6;
    void myDispaly();
   default void staticPrivate(String name){
        System.out.println( name + i);
    }
}
 
 interface Interface2 {
     //Interface1.super.dispaly ;
 void myDispaly();
private static void staticHello(){
     System.out.println(" static method over ride ");
 }
 default void staticPrivate( ){
    staticHello();
 }
 static void staticHello( int a,int b ){
     System.out.println(a + " "+ b);
 }
 }
 interface Interface3 {
   // private static void staticHello(){

   // }
    void hello();
    static void staticHello(){
        System.out.println("Display static method");
    }
     default void defaultHii(){
         System.out.println("default method over ride ");
    }
 }
  interface Interface4 extends Interface1 , Interface2,Interface3{
      void hii();
         default void defaultHii(){
          System.out.println("Dispaly default hii method");
          Interface3.super.defaultHii();
         // Interface2.super.myDispaly();
      }
  }
  
  public class Interface implements /*Interface1, Interface2 , Interface3,*/ Interface4 {
     public void display(){
         System.out.println("Display  dispaly method in Interface 1");
      }
      public void myDispaly(){
          System.out.println("Display  my display method in Interface 2");
      }
      public void hello(){
          System.out.println("Display hello method in interface 3");
      }
      public void hii(){
          System.out.println("Dispaly hii method in interface 4");
      }

      public static void main(String[] args) {
          int i = 3;
       Interface interfaceObj = new Interface();
       interfaceObj.display();
       System.out.println(i +"  "+Interface1.i);
       interfaceObj.myDispaly();
       interfaceObj.hello();
       interfaceObj.hii();
       Interface3.staticHello();
       interfaceObj.defaultHii();
       Interface2.staticHello(6,8);
       interfaceObj.staticPrivate("navya");
       Interface1 interObj = new Interface(){
          public void display(){
              System.out.println("Anonymus instance ");
           }
       };
       interObj.display();
      }
  }
//  class nameComparator implements Comparator{
      
 // }
package OopsPractices;

import OopsPractices.InnerInterfacePractices.InnerInterfacePractices1;

interface FristInterface{
     public void display();
private void privateMethod() {
    System.out.println("private method");
}
  default void defaultMethod(){
privateMethod();
System.out.println("Dispaly default method");
}
//protected void protectedMethod();
}
public class InterfacePractices extends Interface implements FristInterface, Interface4 ,InnerInterfacePractices.InnerInterfacePractices1 {

    @Override
    public void display() {
        System.out.println("Display display method");
    }
    InterfacePractices(){

    }
    public static void main(String[] args) {
        InterfacePractices obj = new InterfacePractices();
        obj.defaultMethod();
        obj.display();
        obj.defaultInner();
        InnerInterfacePractices.staticInner();
    }
    interface NestedInterface{

    }
  
}
 interface InnerInterfacePractices {
     static void staticInner(){
         System.out.println("Display static inner");
     }
  
    interface InnerInterfacePractices1{
        default void defaultInner(){
            System.out.println("Display default inner");
        }
    }  
}
 class DiffrentPackages implements InterfaceAssignment.Assignment3{

    @Override
    public void method1() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void method3() {
        // TODO Auto-generated method stub
        
    }

}

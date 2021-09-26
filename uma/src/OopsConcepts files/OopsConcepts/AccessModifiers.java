package OopsConcepts;

import OopsConcepts.AccessModifiers.Test;

// can not define top level class as "private"  or "protected"
// class that has no defined access modifier  is called default access modifier

// private --- scope with in the class only
//default ----with in the same package only
//protected  ----outside the package also but only with inheritance
//public---- access anywhere

   //protected class Protect{ }  // only public, abstract and final are permitted

public class AccessModifiers {

    int i;
    static String name;
    private float  f;


    AccessModifiers(){
        this.i=10;
    } 

    private AccessModifiers(int j){
         j=20;
         this.i=25;
         System.out.println("private constructor");
    }
    
  public static void main(String[] args) {
    
     AccessModifiers acm =new AccessModifiers();
      acm.test();   // can access  to private method since it is with in the class
     
     acm.i=10;     //can access class level variables
     acm.f=20.0f;   // can access private variable since it is within the class
     System.out.println(acm.f);

      AddDistance add =new AddDistance();   //creating instance for another file in the same package
      add.add(1, 2.0f);

     //addition obj = new addition();  // tried to call method from another package----no access!


     Parameters para = new Parameters("uma", 10);   //calling constructor from another class "Parameters"
     para.name="uma";
     
     SubClass sub = new SubClass();    //calling method from other class "Subclass"
     sub.display();


     ConstructorChain cc = new ConstructorChain(); 
     cc.display();   //  also tried to call private method from this class but no access!


     AccessModifiers acm1 = new AccessModifiers( 10);
     acm1.test();
    
    }
       private void test() {  //private method with in the class

    
       }

       private class personal{
           String sub ;
           int k;
           
           int add(int i,boolean b){
               i=100;
               b=true;
               return i;
           }
       }
    
    class Test{
        boolean b;

        void dip(){
            System.out.println("dip method");
        }
        Test(){
         this.b =true;
         System.out.println("true");
        }
    }
    
}

abstract class demo{     //abstract classe can contain only abstract methods
 
    abstract void display();    //abstract methods will nothave a method body

}   


 final class finale{

 }
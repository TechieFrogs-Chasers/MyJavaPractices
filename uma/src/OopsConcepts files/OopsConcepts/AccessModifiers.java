package OopsConcepts;

// can not define top level class as "private"  or "protected" since even JVM ca not see it
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
    
  public static void main(String[] args) {     //can not define main method with out public because it is the entry point for JVM
    
     AccessModifiers Obj = new AccessModifiers();
     Obj.test();   // can access  to private method since it is with in the class
     
     Obj.i=10;     //can access class level variables
     Obj.f=20.0f;   // can access private variable since it is within the class
     System.out.println(Obj.f);

      AddDistance add =new AddDistance();   //creating instance for another file in the same package
      add.add(1, 2.0f);

     //addition obj = new addition();  // tried to call method from another package----no access!


     Parameters para = new Parameters("uma", 10);   //calling constructor from another class "Parameters"
     para.name="uma";
     
     InnerClass sub = new InnerClass();    //calling method from other class "Subclass"
     sub.display();

     ConstructorChain cc = new ConstructorChain(); 
     cc.display();   //  also tried to call private method from this class but no access!


     AccessModifiers acm1 = new AccessModifiers( 10);
     acm1.test();
    
    }
       private void test() {  //private method with in the class

        System.out.println("in private method");
    
       }

      /* private class personal{    //inner private class
           String place ;
           int k;
           
           int add(int i,boolean b){      //inner method
               i=100;
               b=true;
               return i;
           }
       }*/
    
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


 final class Finale{
     String  place;
     boolean b;

    void fin(){
        System.out.println("final method");
    }
    

    Finale(boolean t){
        t=true;
    }

 }
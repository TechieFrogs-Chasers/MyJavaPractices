/* 
we can't override static methods. Even we try it calls only parent method.
*/
public class ClassA {
    static void StaticMethod(){
        System.err.println("Parent");
    }
  void meth(){
        System.out.println("inside parent method");
    }
     
}
class ClassB extends ClassA{
    static void StaticMethod(){
        System.out.println("Child");
    }
  /*void meth(){
        System.out.println("inside child method");
    }*/
    
}
class Driver{

    public static void main(String[] args) {
        //ClassA obj = new ClassA();
        //obj.StaticMethod(); // parentclass method is called
        //ClassB obj2 = new ClassB();
       // obj2.StaticMethod();// subclass method is called
        ClassA obj3 = new ClassB(); // by using this only parent members can be called, not child class.
        obj3.StaticMethod(); // parentclass method is called
        obj3.meth();   
    }   

}


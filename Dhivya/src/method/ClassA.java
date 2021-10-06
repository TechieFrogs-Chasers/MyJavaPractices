/* when a method is called by creating a object for parent class
referring to the subclass, the parent method is called, not the subclass method
*/
public class ClassA {
    static void StaticMethod(){
        System.err.println("Parent");
    }
    static void meth(){
        System.out.println("inside parent method");
    }
}
class ClassB extends ClassA{
    static void StaticMethod(){
        System.out.println("Child");
    }
    
}
class Driver{

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.StaticMethod(); // parentclass method is called
        ClassB obj2 = new ClassB();
        obj2.StaticMethod();// subclass method is called
        ClassA obj3 = new ClassB(); // by using this only parent members can be called, not child class.
        obj3.StaticMethod(); // parentclass method is called
        obj3.meth();   
    }   

}


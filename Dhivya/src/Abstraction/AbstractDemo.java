package Abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
        SubClass1 obj = new SubClass1();
        Sample s = new Sample(){
/*Tried to create object for abstract class by defining the ABSTRACT methods inside
the parathesis}*/
            @Override
            void a_method() {
                // TODO Auto-generated method stub   
            }      
        };
        obj.a_method();
        obj.normal();
    }    
}
abstract class Sample
{
    abstract void a_method();
    Sample(){
        System.out.println("This is constructor of abstract class");
    }
    void normal(){
        System.out.println("This is normal method of abstract class");
    }
}
class SubClass1 extends Sample{

    @Override
    void a_method() {
        System.out.println("This is abstract method of subclass ");
        
    }

}

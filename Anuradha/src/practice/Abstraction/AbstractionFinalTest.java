package Abstraction;

 // abstract -->final class
abstract class NormalAbstractClass{
    abstract void Display();
     
    static void  staticdisplay(){
        System.out.println("Static display in normalAbstact class");
    }

    void nonStaticClassDisplay(){
        System.out.println("Non static method in normalAbstarct class");
    }
     
    final void finalMethod(){
        System.out.println("final method");
    }
}

final class finalClass extends NormalAbstractClass{

    @Override
    void Display() {
       System.out.println("Implementing display method of abstract class in final child class");
    }
    
}
public class AbstractionFinalTest {
    public static void main(String[] args) {
        finalClass finalObj = new finalClass();
        finalObj.Display();
        finalObj.finalMethod();
        finalObj.nonStaticClassDisplay();
        finalClass.staticdisplay();
    }

   
    
}

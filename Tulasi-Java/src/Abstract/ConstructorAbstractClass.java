package Abstract;//Package
abstract class PrintConstructor{//abstract class
    PrintConstructor(){//abstract constructor
        System.out.println("This is constructor of abstract class." );
    }
    abstract void a_method();//abstract method
    public void non_abstract_method(){//non-abstract method
        System.out.println("THis is a normal method of abstract class.");
    }
}
class SubClass extends PrintConstructor{//subclass
    void a_method(){//method in subclass
        System.out.println("This is abstract method.");
    }
}
public class ConstructorAbstractClass {//Driver class
    public static void main(String[] args) {//main method
        SubClass subclassObj=new SubClass();//Instance for subclass
        subclassObj.a_method();//call subclass/ abstract method
        subclassObj.non_abstract_method();//call non-abstract method
    }
}

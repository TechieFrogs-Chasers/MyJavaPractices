package Methods;//Package


class A {//Super class

    static void print() {//static method
        System.out.println("Parent");//Print statement
    }
}

class B extends A {//Subclass that inherit from superclass

    static void print() {//static method
        System.out.println("Child");//Print statement
    }
}

public class ParentAndChild {//Driver class

    public static void main(String[] args) {//main method
        A myObjA = new A();//Instance of super class
        myObjA.print();//access super class methods
        B myObjB = new B();//Instance of subclass
        myObjB.print();//access sub class methods

        A myObjAB = new B();//Instance of super class to refer the subclass
        myObjAB.print();//call the method by an obj of superclass refer to the subclass

    }
}

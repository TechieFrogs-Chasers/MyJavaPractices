//package MethodAssignment;
class A11 {
    static void method() {
        System.out.println("Parent.");
    }
}

class B {
    static void method() {
        System.out.println("Child.");
    }
}

public class Parent extends A11 {
    public static void main(String[] args) {
        B object = new B();
        A11 objectA11 = new Parent();
        // Parent objectA = (Parent) new B();
        A11.method();
        object.method();
        B.method();
        objectA11.method();
        A11.method();
        // B.method();
        // Parent.method();
    }
}

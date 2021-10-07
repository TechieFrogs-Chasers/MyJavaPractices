package InheritanceAssignment;

public class Parent {
    public static void main(String[] args) {
        Parent parentobj = new Parent();
        Child childobj = new Child();
        parentobj.ParentClass();
        childobj.childclass();
        childobj.ParentClass();

    }

    void ParentClass() {
        System.out.println("This is parentClass method");
    }
}

class Child extends Parent {
    void childclass() {
        System.out.println("This is childclass method");
    }
}
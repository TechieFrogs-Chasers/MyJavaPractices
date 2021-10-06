
class ParentClass {

    void parent() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    void child() {
        System.out.println("This is child class");
    }
}

public class Parent {
    public static void main(String[] args) {
        ParentClass parentobClass = new ParentClass();
        ChildClass childobj = new ChildClass();
        parentobClass.parent();
        childobj.child();
        childobj.parent();

    }
}

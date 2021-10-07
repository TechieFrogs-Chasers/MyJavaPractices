package InheritanceAssignment;

public class ParentClass2 {
    public static void main(String[] args) {
        ParentClass2 parentobClass = new ParentClass2();
        ChildClass2 childobj = new ChildClass2();
        parentobClass.Parent();
        childobj.Child();
        // childobj.Parent();

    }

    private void Parent() {
        System.out.println("This is parent class");
    }
}

class ChildClass2 extends ParentClass2 {
    void Child() {
        System.out.println("This is child class");
    }
}

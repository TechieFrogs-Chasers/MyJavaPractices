class Parent{ 
    static void print(){
    System.out.println("Parent");
    }
}
class Child extends Parent{
    static void print(){
        System.out.println("Parent");
        }
}

public class ParentChildClassTest {
    public static void main(String[] args) {
// Static methods cannot be overridden because they are not dispatched on the object instance at runtime.
// The compiler decides which method gets called.
        Parent pObj = new Parent();
        pObj.print();
        Child cObj = new Child();
        cObj.print();

        Parent obj = new Child();
        obj.print();
    }
}

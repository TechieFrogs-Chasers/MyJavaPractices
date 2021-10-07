package OopsPractices.MethodsAssignment;
class A{
    static void methodDispaly(){
        System.out.println("parent");
    }
}
class B extends A{
    static void methodDispaly(){
        System.out.println("child");
    }
}
public class ParentChild {
    public static void main(String[] args) {
        A.methodDispaly();
        B.methodDispaly();
       // B obj = new B();
       // obj.methodDispaly();
       // obj.methodDispaly();
    }
}

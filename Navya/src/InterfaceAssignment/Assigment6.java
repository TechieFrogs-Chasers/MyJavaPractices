package InterfaceAssignment;
interface First{
    void firstMethod();
}
interface Second{
    void secondMethod();

}
interface Third{
    void thirdMethod();

}
interface All  extends First,Second,Third{
    void fourtMethod();
    default void fourtDefaultMethod(){
        System.out.println("Display Fourth Default method");
    }
    static void fourthStaticMethod(){
        System.out.println("Display Fourth Statc Method");
    }
}
public class Assigment6 implements All {
    public void firstMethod() {
        System.out.println("Display first method");
    }
    public void secondMethod() {
        System.out.println("Display second method");
        
    }
    public void thirdMethod() {
        System.out.println("Display third method");
        
    }
    public void fourtMethod() {
        System.out.println("Display fourth method");
        
    }
    public static void main(String[] args) {
    Assigment6 obj = new Assigment6();
    obj.firstMethod();
    obj.secondMethod();
    obj.thirdMethod();
    obj.fourtMethod();
    All.fourthStaticMethod();
    obj.fourtDefaultMethod();
    }
    
}

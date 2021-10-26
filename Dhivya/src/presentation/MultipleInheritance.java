package presentation;

public class MultipleInheritance implements One, Two, Three{

    @Override
    public void getData() {
        // TODO Auto-generated method stub
        
    }
    public int getData(){
        
    }
    public void demo(){
        One.super.demo();
        System.out.println("In class");
    }
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.demo2();
        obj.demo();
    }
}
interface One{
    void getData();
    default void demo(){
        System.out.println("One");
    }
}
interface Two{
    int getData();
    default void demo2(){
        System.out.println("Two");
    }
}
interface Three{
    void getData();
    default void demo3(){
        System.out.println("Three");
    }
}
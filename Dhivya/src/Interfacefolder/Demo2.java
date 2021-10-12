package Interfacefolder;

public interface Demo2 extends DemoInterface{
    int a =40;
    String name = " Demo2";
    int age1 = 30;
    float f = 3.14f;
    void display();
    void messege();
    void method();
    public static void main(String[] args) {
        System.out.println("the value of a in parent Interface is : " + age);
        System.out.println("The value of f in parent Interface IS : " + f);
        System.out.println("The value of f in parent Interface IS : " + DemoInterface.f);
    }
    
}

package Interfacefolder;

public class SampleInterface implements DemoInterface, Demo2 {
    int a =30;
    String name  = "Sample";
    public void display() {  // the abstract methods of the interface are implemented in this class
        System.out.println("This method is impleted from Demo1 interface Display method:");
    }
    public void messege() {
        System.out.println("This method is impleted from Demo1 interface messege method:");
    }
    public void method() {
        System.out.println("This method is impleted from Demo2 interface method");
    }

    public static void main(String[] args) {
        SampleInterface obj = new SampleInterface();
        System.out.println("Name : " + obj.name);
        System.out.println("Value of a : " + obj.a);
        System.out.println("Interface name: " + DemoInterface.name);
        System.out.println("Value of Interface A: "+ DemoInterface.a);
        System.out.println("Interface2 name: " + Demo2.name);
        System.out.println("Value of Interface2 A: "+ Demo2.a);
        System.out.println("The valu of age: " + age1);
        System.out.println("The value of age in interface 1: " + age);
        obj.method();
        obj.messege();
        obj.display();
        obj.defaultMethod();
    }
}

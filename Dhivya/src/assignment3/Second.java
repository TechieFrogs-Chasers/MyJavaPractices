package assignment3;
/*this pgm makes clear that inidivudual classes cannot be declared protected, private or static
only public, abstract or final permitted*/

public class Second {
    public static void main(String[] args) {
        Parent obj = new Parent();
        Subclass obj2 = new Subclass();
        obj2.display();
        obj2.Method();
        
    }
    
}
 class Parent{
    void Method(){
        System.out.println("This is parent class:");
    }
}
class Subclass extends Parent{
    void display(){
        System.out.println("This is child class");
    }
}
package Inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.country();
        obj.city();
        obj.state();
        obj.display();
        Child.ChildMethod();
        obj.ChildMethod();
    }
}
class Grand{
    String name = "Country";
    Grand(){
        System.out.println("Inside grand constructor:" + name);
    }
void country(){
    System.out.println("Inside grandparent class: ");
}
void display(){ 
    System.out.println("grandparent method");
}

}
class Parent extends Grand{
    String name = "state";
    Parent(){
        System.out.println("Inside parent constructor:" + name+ super.name);
    }
    void state(){
        
        System.out.println("Inside parent class: ");
    }
    void display(){ 
        super.display();
        System.out.println("parent method");
    }

}
class Child extends Parent{
    String name = "city";
    Child(){
        System.out.println("Inside child constructor:" + name+ super.name);
    }

    void city(){
        System.out.println("Inside child class: ");
    }
    void display(){ 
        super.display();
        System.out.println("child method");
    }
    static void ChildMethod(){

        System.out.println("inside child static : ");
    }
}
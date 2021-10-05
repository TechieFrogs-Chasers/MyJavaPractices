package Inheritance;//Package
class Parent{//parent class
    void parentMethod(){//method
        System.out.println("This is parent class");
    }
}
class Child extends Parent{//child class extends parent class
    void childMethod(){//method
        System.out.println("This is child class");
    }
}
public class ParentAndChildMethod {//driver class
    public static void main(String[] args) {//main method
        Parent parentObj= new Parent();//instance for parent class
        Child childObj= new Child();//instance for child class
        parentObj.parentMethod();//call for parent method
        childObj.childMethod();//call for child method
        childObj.parentMethod();//call for parent method from child instance
    }
}

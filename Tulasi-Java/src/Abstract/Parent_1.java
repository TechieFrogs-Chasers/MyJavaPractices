package Abstract;//Package
abstract class Parent{//Abstract class
    abstract void message();//abstract method ,method should not have body
}

class FirstSubclass extends Parent{//First Subclass

    void message() {//method
        System.out.println("This is first subclass.");
    }
}
class SecondSubClass extends Parent{//Second subclass

    void message() {//method
        System.out.println("This is second subclass.");
    }
}
public class Parent_1 {//driver class
    public static void main(String[] args) {//main method
        FirstSubclass myObj=new FirstSubclass();//Instance for first subclass
        SecondSubClass myObj1=new SecondSubClass();//Instance for second subclass
        myObj.message();//call first subclass
        myObj1.message();//call second subclass

    }
}

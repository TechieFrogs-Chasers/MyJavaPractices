package Assignment3;

public class Calling {
    void parent(){
        System.out.println("This is parent class");
    }
}
class Calling2 extends Calling{
    void child (){
        System.out.println("This is child class");
    }
    public static void main(String...args){
        Calling2 obj = new Calling2();
        obj.child();
        Calling obj2=new Calling();
        obj2.parent();
        obj.parent();

    }
}
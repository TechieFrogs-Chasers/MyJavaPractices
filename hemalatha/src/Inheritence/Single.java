package Inheritence;
class Father{
    int age;
    String name;
    void property(){
        System.out.println("father class:"+age);
    }
    Father(){
        System.out.println("father class constructor");
    }
    /*Father(int a, int b){
        System.out.println("enter the value of a");
    }*/
}

class Child extends Father{
    int count;
    String address;
    void acquire(){
        System.out.println("child class:"+name);
    }
    Child(){
        System.out.println("child class constructor");
    }

    public class Single{
    public static void main(String[] args) {
        //Father fat = new Father();//we can not define instance for parent class
        Child ch = new Child();
        ch.acquire();
        ch.property();
        
        
    }
    
    }
}




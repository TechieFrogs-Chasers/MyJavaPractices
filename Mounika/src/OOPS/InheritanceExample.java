package OOPS;

class A{

    int i = 10;
    private String name = "Mounika";

    void display(){

        System.out.println("In A class Dispaly method");
    }

     A(){

        System.out.println("In A class constructor");

    }
    A(int i ){

        System.out.println("In A class parameter constructor");
    }

    void happy(int a){

        System.out.println("In A class Happy parameter method");
    }

}

class B extends A{
    int j = 15;
    

    void hello(){
        super.happy(5);

        System.out.println("In B class Hello method");
    }

    B(){

        System.out.println("In B class constructor");

    }
    B(String name){
        String name1 = "Madhu";

        System.out.println("In B class String parameter constructor");
    
    }
    B(int i){
        // over loading constructor checks the size, type, order of parameters
        this("Madhu");

        System.out.println("In B class int parameter constructor");
    }

    void display(){
    /*In over riding the methods checks the singnature and visibility*/   

        System.out.println("In B class Dispaly method");
        super.display();// calling A class Display
    }
    
}

class C extends B{
    int k = 20;

    int write(){

        System.out.println("In C class Write method");

        return(5);
    }
    C(){
        super(5);

        System.out.println("In C class constructor");

    }
    C(String name){
        

        System.out.println("In B class parmeter constructor");
    
    }



}

public class InheritanceExample {

    public static void main(String[] args) {
        C obj = new C();
        // Here internally the A class constructor will be called 1st
        // If the A class constructor is having any restricted visibility its shows error when creating C class instance 

        obj.hello();
        obj.happy(3);
        obj.write();
        System.out.println("C class int method Value : "+ obj.write());
        obj.display();
        /*complier 1st checks display method in its own class i.e in C class, 
        if display method is overrided prints the value */
        

        /* in main method we connot super or this key word because they are with object level but
        static is with class level*/ 
        /* Super and  this is used only in 1st line of a constructor, we cannot use both this and super at a time*/ 

        
        

    }
}
    


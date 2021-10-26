package OOPS;
class MainClass{
    int i = 5;
    String name;
    private float f = 10.5f;
        void display(){
            System.out.println(" In main class main method");
        }
}
class SubClass1 extends MainClass{
    int j = 10;
    void write(){
        System.out.println("In sub class write method");
        
    }
}



public class Inheritance {
    public static void main(String[] args) {
       SubClass1 subObj = new SubClass1();
        subObj.write();
        subObj.display();
        subObj.name="Mounika";
       // subObj.f= 52.32; private stuff cant be inherited
        // with sub class instance used to call mainclass properties
        //private elements of main class does not get access in subclss here it is float
       /* MainClass mainObj = new MainClass();
        mainObj.j=11;*/ //this is not possible

        
        
    }
    
}

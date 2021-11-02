package OOPS;

// Single inheritance 

class MainClass{// super class or parent class or  base class

    int i = 5;
    String name;
    private float f = 10.5f;

        void display(){

            System.out.println(" In main class main method");
        }
        static class InnerClass{// static Inner class

            int j = 10;
            String Name = "Madhu";

            void hello(){

                System.out.println(" In Inner class");
            }
        }
}

class SubClass1 extends MainClass{//sub class or child class or derived class or extended class

    // in inheritance we can only extends single class
    int j = 10;

    void write(){

        System.out.println("In sub class write method");
        
    }

    public void grandDisplay() {
    }
}

class SubClass4 extends MainClass.InnerClass{// inheriting the inner class of main class

    public static void main(String[] args) {

        SubClass4 sbObj = new SubClass4();

        sbObj.hello();// calling inner class method
        // we cannot call the main class properties as we are inhering only the inner class.
        // we cannot directly extnds the non statci clasees, but we can access the static classess
        // becuase non static we use the main class ref to create ref of innerclass that applies here
        
    }
    
}


public class Inheritance { // Driver class
    public static void main(String[] args) {
       SubClass1 subObj = new SubClass1();
        subObj.write();
        subObj.display();
        subObj.name="Mounika";
        // we can write the main in subclass also and creat the instance on sub class
       // subObj.f= 52.32; private stuff cant be inherited
        // with sub class instance used to call mainclass properties
        //private elements of main class does not get access in subclss here it is float, private stuff only to that class
       // provate elements cant inherit to sub class
        /* MainClass mainObj = new MainClass();
        mainObj.j=11;*/ //this is not possible
        

        
        
    }
    
}

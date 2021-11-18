package OOPS;

//Multi Level Inheritance

class GrandClass{
    int l = 10;

    void grandDisplay(){

        System.out.println("In grand class Display ");
    }

}

class MainClass1 extends GrandClass{// super class or parent class or  base class

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

class SubClass2 extends MainClass1{//sub class or child class or derived class or extended class

    // in inheritance we can only extends single class
    int j = 10;

    void write(){

        System.out.println("In sub class write method");
        
    }
}

class SubClass3 extends MainClass1.InnerClass{// inheriting the inner class of main class

    public static void main(String[] args) {

        SubClass3 sbObj = new SubClass3();

        sbObj.hello();// calling inner class method
        // we cannot call the main class properties as we are inhering only the inner class.
        // we cannot directly extnds the non statci clasees, but we can access the static classess
        // becuase non static we use the main class ref to create ref of innerclass that applies here
        //sbObj.grandDisplay(); this will give error
        
    }
    
}


    
public class MultiLevelInheritance {
    public static void main(String[] args) {

        SubClass2 subObj = new SubClass2();
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
        subObj.grandDisplay();// we inheriting the grand class properties
            System.out.println(subObj.l);

                OtherMainClass otObj = new OtherMainClass();
                otObj.otherMainClass();
    }
 

    
}

class OtherMainClass extends GrandClass{ // Hierarichal Inheritance 
    // Extend the grand class in main class and othermain class too

    int k = 10;

    void otherMainClass(){

        System.out.println(" Another main class, method");
    }
}

// In java Muitiple inheritance is not possible, it is done in interfaces
//We cann't access more than 1 class
// Even Hybrid is also not possible in inheritance, this is also achive in interfaces

// Constrctor is not acts  the members of the class
// only the variables, methds, nested class are acts like  memebrs or properties of class not the constructors  


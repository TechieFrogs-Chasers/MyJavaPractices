//import StaticClass.NestedClass.NonstaticNestedClass;

//package NestedClass-folder;
//this pgm has both static and non static class:
public class StaticClass {  //superclass
    static String name = "RBI";

    static void StaticMethod(){ //superclass method
        System.out.println("Inside the outer class method: " + name);
        
        class LocalInnerClass{   // local innerclass inside a method
            static String bname = "SBI";
            void localMethod(){
                System.out.println("Inside local inner class method: " + bname+", " +name);
            }
        }
        LocalInnerClass obj1 = new LocalInnerClass();
        obj1.localMethod();
        
    }
    static class NestedClass{    // static nested class
        static String name = "Andhra";
        void nestedMethod(){     //non static method
            System.out.println("Inside static nested class: " + name);
        }
        static void nestedMethod2(){  // static method
            String name = "hyderabad";
            System.out.println("Inside the static class static method: " + name);
        }
    }
    public class NonstaticNestedClass{    // non static innner class
        NonstaticNestedClass(){       //non static innerclass constructor
            System.out.println("Inside Non-Static nested class constructor: " + name);
        }

        }

    
    public static void main(String[] args) {
        System.out.println("The output for static nested class:");
        System.out.println("In main method: " + name);
        StaticMethod();
       StaticClass.NestedClass nestedobj = new StaticClass.NestedClass();
       nestedobj.nestedMethod();
       NestedClass.nestedMethod2();
       StaticClass outerobj = new StaticClass();
      StaticClass.NonstaticNestedClass newobj  = outerobj.new NonstaticNestedClass();

    }
    
}

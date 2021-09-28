
public class OuterClass {//outer class
    
    OuterClass(){//outer class constructor
        System.out.println("In outer class constructor");
    }
    static void OuterMethod(){// outer class method
        System.out.println(" In outer class method");
    }
    static class InnerClass{ //nested class
       static void InnerMethod(){//nested class method
            System.out.println("In inner class method");
        }   
    }
    public static void main(String[] args) {// main method
        System.out.println(" In Main method:");
        OuterMethod(); // calling outer method without creating object for outerclass, bcz it's static
        // calling nested class without creating instance for outer class, bcz the nested class is static.
        InnerClass innerobject = new InnerClass(); 
        // to access the method of the nested class, object for nested class is created.
        innerobject.InnerMethod();
        
    }
}

package InterfaceAssignment;

import Abstraction.InterfaceExample;
import Collegefolder.Interfacesample;

public class Exercise7 extends InterfaceExample {// inheriting from the outer class

    Interfacesample method(){  //creating method with protected class return type 
        Protect protobj = new Protect(5);
        System.out.println("hi there am returning protected class object:");
        return protobj;
       // return (Interfacesample)(protobj); 
         // returning protected class object.
    }
    

    
    public static void main(String[] args) {
        Exercise7 obj = new Exercise7();
        InterfaceExample outerobj = new InterfaceExample(); // creating object for outer class
        InterfaceExample.Protect ex = outerobj.new Protect(5);// creating object for inner class
        Interfacesample sam = obj.method(); //INTERNAL upcasting to interface reference
            ex.display();
    
}
}

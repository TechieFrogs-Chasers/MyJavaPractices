
package Interfacefolder;

import Interfacefolder.NestedClass.ClassinsideInterface;

public class NestedInterface extends ClassinsideInterface{     
    //1.Interface can be created inside a class
    //2.Interface cannot have constructors
    //3.Interface can extend another interface, it cannot implement an interface.
    //while extending theres no need for implementinf the interface abstract methods.
    //4.only a class can implement an interface, but it should implement all the abstract methods 
    //of the interface and it can also extend another class. i.e it can have parent class and also superinterfaces
//the priority goes like this : classname extends parentclass name implements interface1, interface2{}
    
       interface Wholesaler{           
        double a = 10.0d;           
        String name = "wholesale ";
        void display();
        /*public Wholesaler(){    
        }*/    
        default double commission(){

            double commission = a*20;
            System.out.println("Inside the default method of the interface:");
            return commission();
        }
    }
    public static void main(String[] args) {
        NestedInterface obj = new NestedInterface();
        ((Wholesaler) obj).commission(); // what method of calling is this?
    }
}
interface Bear extends NestedInterface.Wholesaler{

}

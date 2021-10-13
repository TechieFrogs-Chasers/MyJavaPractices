package Interfacefolder;

import Interfacefolder.NestedClass.ClassinsideInterface;

public class NestedInterface extends ClassinsideInterface{     
                                     //1.Interface can be created inside a class
                                    //2.Interface cannot have constructors
    interface Wholesaler{           //3.Interface can only implement another interface, it cannot extend an interface.
        double a = 10.0d;           //4.
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

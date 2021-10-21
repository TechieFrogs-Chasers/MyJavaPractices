package Abstraction;

import Collegefolder.Interfacesample;

public class InterfaceExample {//OUTER CLASS


    protected class Protect implements Interfacesample{ //PROTECTED CLASS
        static int a;
       public Protect(int a){
            this.a = a;
        }

        
        @Override
        public void display() {
            // TODO Auto-generated method stub
            System.out.println("I implemented my interface method: the value of a:" + a);
            
        }
        
        
    }
    
    
}

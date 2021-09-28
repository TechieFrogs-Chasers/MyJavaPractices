package OopsConcepts;

import OopsConcepts.OuterClasses.Inner.Innermost;
import OopsConcepts.OuterClasses.Inner.Innermost.MostInner;

public class OuterClasses {     //top level class

     int a;
     static String place;
     static final int k=45;
     private String name;


     public static void main(String[] args) {

        //name= "uma";  // error --> can not make ref to the non static field

        OuterClasses outerobj = new OuterClasses();  //instance for the outer class
        outerobj.dis();     //private method can be called with in the own class

        outerobj.callingInner();  //calling own method and  instance variables
        System.out.println( outerobj.name + place + k );

       // Inner innerobj = new Inner();   //can not create instance like this

       OuterClasses.Inner innerobj1 = outerobj.new Inner();  //original syntax to create instance for its inner classes
       System.out.println(innerobj1.b);
    
        Inner innerobj =outerobj.new Inner();  //created instance for inner class using outer class instance
        innerobj.c=10;    //accessing inner class varible

       //System.out.println(innerobj.innermethod(10)); //can not print methods as args
          
        innerobj.innermethod(10);  //accessing inner class method
         
    }
     OuterClasses(){ //constructor in top level class

         //this(10);  //  can not call constructors of inner class
        System.out.println("toplevel nested classes");
    }

    void callingInner(){      // outer class method

         Inner innerobj = new Inner();   //inside a method instance for inner class can be created with out outer class instance

        innerobj.innermethod(10);   // calling inner method with inner class instance

        innerobj.callingInnerMOst(10, "uma"); //calling innermost method with inner instance

         System.out.println(innerobj.c);  //private int from the "Inner class"

        //Innermost innermostobj = new Innermost(); //innermost instance can not be created in the outer without inner class instance 

        Innermost innermostobj = innerobj.new Innermost();
        innermostobj.innermostmethod();  //can call innermost method

        // MostInner most = new MostInner(); ----------error
        //most.mostInnermethod();

         MostInner most = innermostobj.new MostInner(); 
         most.mostInnermethod();
         
    }


     private int dis(){     //method in the top class

       // Innermost innermostobj = innerobj.new Innermost();   //calling inner class method into a private method
       // innermostobj.innermostmethod();       
               
         return 10;
     }

    class Inner{       // class inside outer class

           // public static void main(String[] args) {    //main method can not be executed without defining it in public class
         

         int b;
         String address;
         private int c;
           
         Inner(int i){
             c=25;
         }

         Inner(){
            System.out.println("inner constructor"+c); //contructor in inner
            System.out.println(k);
        }

        void innermethod(int j){
           
            j=20;
           System.out.println("inner method");    //method  in inner
        }
         

        void callingInnerMOst(int i, String name){

            Innermost innermostobj = new Innermost(); 
            innermostobj.innermostmethod();   //calling innermost method in the inner class
            MostInner most =innermostobj.new MostInner();
            most.mostInnermethod();
        }

          
        class Innermost{      //innermost class inside inner

             int d;

             Innermost(){     //innermost class constructor

                   System.out.println(" innermost constructor ");
            }

             void innermostmethod(){   //innermost method

                   System.out.println("innermost method");
            }
    
             class MostInner{

                  int m;
                 static int y;   //static int ??
                 static String name;
                void mostInnermethod(){

                    y=200;
                  System.out.println("most most inner"+y+name);
                }
            }
        }
    }
}
       /* Notes
  
        outer class can not access variables or methods of its  inner class .The only way is to create  instance for inner  class 
        in the main method by using instance of the outer class     OR
        create an instance of the inner class in any method of the immediate outer class.
        Static variables can not be declared in the inner classes, only static final (constants)
         
        */
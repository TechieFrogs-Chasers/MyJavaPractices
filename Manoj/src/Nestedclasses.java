public class Nestedclasses {
    int i=25;
    String name="manoj" ;
    

    class Inner{       //inner class or nested class OR non static nested class

           class NestInner{      //created a nest inner method in the inner class 
               void NestInnerMethod(){
                   System.out.println("NestInnerMethod"+" - "+name);
               }

           }

        void  innerMethod(){
            System.out.println("inner class method "+name);
           // outerMethod();        //here we the outer method for that it goes on recursion 
        }
        Inner(){       //created a constructor
            System.out.println("inner constructor"+" "+i);
        }

    }
    void outerMethod(){
        System.out.println("outer class method ");
        Inner innerobj=new Inner(); //calling a inner class method from instance method 
        innerobj.innerMethod();
    }
     public static void main(String...args){
        Nestedclasses outerobj=new Nestedclasses();
         //Inner innerobj1=outerobj.new Inner();    //this one way we call the method 
         outerobj.outerMethod();
        //Nestedclasses.Inner innerobj=new Nestedclasses(). new Inner(); //calling a inner method from static method 
        //innerobj.innerMethod();
         Nestedclasses.Inner.NestInner nestobj= new Nestedclasses(). new Inner().new NestInner(); //calling nestinner one 
         nestobj.NestInnerMethod();
        // nestobj.o
        // nestobj.na
     }

}

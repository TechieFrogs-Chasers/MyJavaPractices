package OopsConcepts;

public interface Interface {


    int i=10;    //variables are public static final by default

    void display();    //in interface, methods are abstract by default
   
    public static void main(String[] args) {
        
       // Interface obj = new Interface();   //interfaces can not be instantiated i,e no instance can be created
            
        System.out.println(i); //can be accessed without instance because varibles are static final by default
    }
       
       
}
interface Other extends Interface,Another,OneMore {    // defining  more interface  // can extend many interfaces
    // inheritence happens between two interfaces

     int j=20;

     void show();

     public static void main(String[] args) {
         System.out.println(j);
         System.out.println(OtherInner. k);
         System.out.println(i);
         System.out.println(a);
         
     }

     interface OtherInner {    // inner interface

        int k =30;
        public static void main(String[] args) {    //main method is defined as just a method in the inner interface
            
        }
     }

}
    

 //class InterfaceClass extends Interface {    //can not extend Interface /or implements Interface

   // class Interface{    //class and interface can not have same name in one program


class InterfaceClass1  { //class-->Nested class--->interface

        void method(){
            System.out.println("In method");
            Nested objNested = new Nested();
            System.out.println(objNested.l);
            
        }

        public static void main(String[] args) {

            InterfaceClass1 obj = new InterfaceClass1();
            obj.method();
             Nested obj1 = obj.new Nested();
             System.out.println(obj1.l);

        }
        class Nested{

              int l ;

            interface InsideNestedclass{
              
                int t=20;
                void inside();
            }


        }
}

interface Another {          //super interface must be an interface but not class
    void anmethod();

    
     default void overRide(){       //default method
         System.out.println("over riding in another");
     }
    
    static void greet(){       // static method
        System.out.println("greet in another");
    }
}

interface Overriding{
     default void overRide(){
         System.out.println("over riding in over riding");
     }
    static void greet(){
        System.out.println("greet in overriding");;
    }
      
}


interface OneMore{     //  interface--->class--->interface--->inner interface
    int a=100;

    public static void main(String[] args) {
        InsideOneMore obj1 = new InsideOneMore();
        System.out.println(obj1.name);
    }

    

    class InsideOneMore{
        String name;

        

        interface Inner{

            void hi();

            public static void main(String[] args) { // in inner nested interfaces or classes main method is just a normal method
                
            }

            interface InInner{
                int p=10;
            }
        }
    }
    

}
abstract interface Third1{    // abstract interface allows other methods along with abstract methods
    void let();
    default void lett(){

    }
}



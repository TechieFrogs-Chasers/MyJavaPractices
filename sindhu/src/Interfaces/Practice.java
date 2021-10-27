package sindhu.src.Interfaces;


/*public interface Practice {
    int j=10;

    void draw();
}

class Rectangle implements Practice{

public void draw(){
        System.out.println("implementing draw method");
    }
}

class Circle implements Practice{

    public void draw(){
        System.out.println("implementing draw method");
    }
}
class Test implements Practice{
    public void draw(){
        System.out.println("implementing draw method");
    }


public static void main(String[] args) {

    Test x = new Test();
    x.draw();
    System.out.println(Practice.j);
    
}

}*/

//Inheritance Interface
/*public interface Practice{

    void hi();
    int j=40;

}

interface Apple extends Practice{    

    String s = "sindhu";

    interface Orange extends Apple{          //inner interface
        void hello();
    }
}

class Banana implements Orange{
    
    public void hello(){

        System.out.println("implementing inner interface method");

    }

    
public void hi(){
        System.out.println("implementing method in practice");
    }

public static void main(String[] args) {

    Banana x = new Banana();
    x.hi();
    System.out.println(Apple.s);
    x.hello();


    
}
}*/

//DEFAULT METHOD

/*interface Practice{

    void hi();
    default void hello(){
        System.out.println("default method");
    }
}
interface  Apple extends Practice{
    default void hello(){
        Practice.super.hello();    //accessing super class default method
        System.out.println("over riding default method");
    }

}

interface Orange extends Apple{
    int j=10;
    

class Banana implements Orange{
   public void hi(){
       System.out.println("implementing method");

    }
}


    public static void main(String[] args) {
        

        Banana x = new Banana();
        System.out.println(Banana.j);
        x.hello();
        x.hi();
        
    


}
}*/

//STATIC METHOD
/*interface Practice{

    void hi();
    static void hello(){
        System.out.println("default method");
    }
}
interface  Apple extends Practice{
    static void hello(){
        Practice.hello(); //accessing in static way
    
        System.out.println("over riding default method");
    }

}

interface Orange extends Apple{
    int j=10;
    

class Banana implements Orange{
   public void hi(){
       System.out.println("implementing method");

    }
}


    public static void main(String[] args) {
        

        Banana x = new Banana();
        System.out.println(Banana.j);
        Apple.hello();
        x.hi();
}
}*/

//OVER RIDING STATIC METHOD
/*interface Practice{
    
    int Orange=767;

    static int cube(int x){

        System.out.println("static method1");
        System.out.println(x*x);
        return x;
    }
}

    interface Apple{         //inner interface
        int j=8;
        
        static int cube(int x){
            Practice.cube(7);

           System.out.println("static method");
            return x*x*x;
        }
    }

class Banana implements Practice,Apple{
        public static void main(String[] args) {
            
        Banana y = new Banana();
        System.out.println(Apple.j);
       System.out.println(Apple.cube(3));
  System.out.println(Practice.cube(2));
        System.out.println(Practice.Orange);
    }

}*/

//NESTED INTERFACE

 interface Practice{  //by default all the interfaces are abstract , no use of writing abstract keyord
    int j=10;
    void method(); // abstract method
     void hi(){

    }
    default void Apple(){
        System.out.println("default method");  //default method
    }

   protected static void Banana(){
        System.out.println("static method implementation"); //static method

    }

    

interface Inner{
        int g=9;
        

       

        static void method(){
            System.out.println("overriding static method");
        }
    
    }
}



class Orange implements Practice{

   public void method(){
        System.out.println("implementing abstract method");
    }

       

        public static void main(String[] args) {
            Orange x = new Orange();
            Practice.Banana();
            x.Apple();
            

        
            
            
        
            

            


        }
    }


    
















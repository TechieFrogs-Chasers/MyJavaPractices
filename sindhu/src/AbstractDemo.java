package sindhu.src;

/*abstract class AbstractDemo {
    int i;
    String name;

    abstract void display(int i, int j); // abstract method

    void hi(){
        System.out.println("method");
    }

    final void hello(){
        System.out.println("final method");
    }

    static void hey(){
        System.out.println("static method");
    }

    AbstractDemo(){
        System.out.println("constructor");
    }

    
}

class Abst extends AbstractDemo{
    void display(int i, int j ){
        
            
            int k = i+j;
            System.out.println("adding two  numbers"+ " "+ k);
            

 }


    public static void main(String[] args) {
        System.out.println("abstract");
        AbstractDemo.hey();

        AbstractDemo obj = new Abst();
        obj.display(4, 5);



        Abst x = new Abst();
        x.display(4,5);
        x.hi();
        
}

}*/

/*abstract class  AbstractDemo
{

    int i =6;
   public abstract void engine();
}
 class Car extends AbstractDemo {

    public void engine()
    {
        System.out.println("Car engine");
        // car engine implementation
    }

    public static void main(String[] args)
    {
        AbstractDemo v = new Car();
        v.engine();
        System.out.println(v.i);
    }
}*/

//abstract by using multiple inheritance

abstract class AbstractDemo{
    int i;
    int age;

   abstract void hi();

    //abstract void foo();

    void hey(){
        System.out.println("normal method");
    }
}

abstract class subclass extends AbstractDemo{
    int j;
    String name;

    void hi(){
        System.out.println("implementing abstract method");
    }

    abstract void oy();

    
}

class otherclass extends subclass{
    int id;

    void oy(){
        System.out.println("implementing subclass abstract method");
    }

    void hey(){
        System.out.println("normal method");
    }



    public static void main(String[] args) {

        otherclass x = new otherclass();
        x.hi();
        x.hey();
        
        
    }
}





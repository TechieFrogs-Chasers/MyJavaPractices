package OopsConcepts;

public  abstract class AbstractInterface  implements First{
  //since the implementing class is abstract,abstract methods need not to be implemented in the class  
}


class Noabstract implements First{
 // since the class is not abstract ,inherited classes must be implemented in the class

   public void hi(){

   }
}

interface First{
    void hi();
}

interface Second{
    void go();
}

abstract interface Third{    // abstract interface allows other methods along with abstract methods
    void let();
    default void lett(){

    }
}

abstract class Abclass extends AbstractInterface implements Third {

    public static void main(String[] args) {
        
        
    }

}


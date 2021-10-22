package presentation;
/*Abstract classes are not forced to override all methods from their super interfaces. 
The first concrete class in the inheritance tree must override all methods:*/
public class ExampleAbstract extends  AbstractClass{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        
    }
    
}
interface Super{
    void run();
    void sleep();
}
abstract class AbstractClass implements Super{
  
     // statements
     void eat(){
         System.out.println("I eat PIZZA");
     }

}
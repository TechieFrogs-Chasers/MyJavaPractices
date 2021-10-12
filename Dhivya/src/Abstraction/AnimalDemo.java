package Abstraction;  // If a abstract class is inherited, the derived class must implement all the 
//abstract methods of its parent abstract class.

public class AnimalDemo {
    public static void main(String[] args) {
        Cats catObj = new Cats();
        Dogs dogObj = new Dogs();
        catObj.cats();
        dogObj.dogs();   
    }    
}
abstract class Animals{

    abstract void dogs();
    abstract void cats();
}
class Cats extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }
    @Override
    void dogs() {
        // TODO Auto-generated method stub
        
    }
}
class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs bark");
    }
    @Override
    void cats() {
        // TODO Auto-generated method stub
      
    }
}

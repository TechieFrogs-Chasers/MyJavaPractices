package presentation;
   
interface Food { //interface

    public void display();
 
 }

 class Chinese implements Food {
 
    public void display(){  //implementing abstract methods
        System.out.println("Chinese Food");
    }
 }
 class Mexican implements Food {
 
    public void display(){   //implementing abstract methods
    System.out.println("Mexican Food");
    }
 }
 class Italian { //class 1
 
    Food f; // creating reference for Food interface

    public Italian(Food f){ // passing interface reference as a parameter to the constructor
       this.f = f;
   }
    public void display(){
      System.out.println("Italian Food");
      f.display();
   }
}
 public class Example {
 
    public static void main(String args[]) {
 

    Chinese c = new Chinese();
 
    Mexican m = new Mexican();
 
    Italian a = new Italian(c);
 
       //a.display() will print Italian and Chinese
       a.display();
 
    Italian a1 = new Italian(m);
 
       //a.display() will print Italian and Mexican
       a1.display();
 
    } 
 }
 /* In the above example, all three classes are loosely coupled. 
 It simply means that you can use the food interface to provide services 
 by injecting any of the implemented services.*/
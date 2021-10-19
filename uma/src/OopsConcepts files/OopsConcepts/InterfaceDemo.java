package OopsConcepts;

public class InterfaceDemo extends Demo1  implements Other{

    // first "extends" and then followed by "implements"
    
    public static void main(String[] args) {
        InterfaceDemo objInterfaceDemo = new InterfaceDemo();
        objInterfaceDemo.overRide();
    }

    public void display(){
        System.out.println("display");
    }
    public void show(){
        System.out.println("show");

    }
    public void anmethod(){
        System.out.println("anmethod");

    }
    public void hi(){

    }
     public void overRide(){
     System.out.println("in interface demo");

     
    }

} 
class Demo1 implements Another,Overriding{

    
    public void anmethod(){

    }
    
      public  void overRide(){
         System.out.println("need to over ride");
        Another.super.overRide();
        Overriding.super.overRide();

    }
    public static void main(String[] args) {
        
        Demo1 objDemo1 = new Demo1();
        objDemo1.overRide();

        Another.greet();
    }


}


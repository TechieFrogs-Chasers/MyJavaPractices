public interface InterfaceDemo {
  int i=10; //internally every variable taken in interface is considers as final, public ,static
    void display(); //internally it take as a abstract  void display();
 abstract void hello(); //if mention or not it automatially takes as public abstract
 default void defaultMethod(){
     System.out.println("In the default method");
 }
    public static void main (String...args){
        System.out.println("interface");
       // InterfaceDemo intobj=new InterfaceDemo();  //we cnnot create instance for interface method
               
    }

}


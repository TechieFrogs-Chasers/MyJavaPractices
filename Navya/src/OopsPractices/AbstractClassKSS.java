package OopsPractices;
abstract class One { // abstract class it should define using abstract keyword
 abstract void dispaly(); // abstract method should defined with keyword it should not contain method body and method statement 
     final void finalMethod(){
     System.out.println(" Dispaly final method");
     }
     void defaultMethod(){
         defaultPrivateMethod();// private method calling in default method
         System.out.println("Dispaly default method");
     }
     //private abstract void privateAbstractMethod(); // abstract method should not be private
     private void defaultPrivateMethod() {
         System.out.println("Display default private method");
     }
     protected abstract void protectedAbstractMethod(); // abstract methods can be protected and public 
}
abstract class Two extends One{ // extending of both the abstract classes 
    static void staticMethod(){
        System.out.println("static display ");
    }
    protected void protectedAbstractMethod(){
        
    }
    static {      // in abstract class  we can initilize the static initilize block and initilization block
        int a  =  55;
        String name = "navya";
    }
    {
        int a = 8;
        int b =  8;

    }
   // abstract  final void hii();
    public static void main(String[] args) {
        // In abstract class aslo we can create main method 
    }
    Two (){
        System.out.println("Default constructor");
    }
    Two( int a , String name){
        System.out.println(a + " "+name);
    }
}
class three extends Two{
   // abstract void hello(); // abstract methods only defined in abstract class we cannot define in non abstract methods 
    @Override
    void dispaly() {
        // TODO Auto-generated method stub
        
    }
    three(){
        super(4, "navya"); // initilization of super class constructor
        System.out.println("subClass constructor");
    }
    
}
public class AbstractClassKSS  extends three{

   /* @Override
    void dispaly() {
        // TODO Auto-generated method stub
        
    }*/
    public static void main(String[] args) {
        AbstractClassKSS obj = new AbstractClassKSS();
        obj.defaultMethod();
        obj.protectedAbstractMethod();
        Two.staticMethod();
        obj.finalMethod();
         Two obj1 = new Two(){

            @Override
            void dispaly() {
                // TODO Auto-generated method stub
                
            }
             
         };
         obj1.dispaly();
    }

}

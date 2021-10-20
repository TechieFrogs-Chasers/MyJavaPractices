package OopsPractices;
 abstract class AbstractPractices{
    abstract void dispaly();
   void methodDispaly(){
       System.out.println("display method");
   }
   static void methodStatic(){
       System.out.println("dispaly static method");
   }
   abstract void method();
AbstractPractices(){
System.out.println("it is a constructor");
}
AbstractPractices(int a){
System.out.println(a);
}

 }
 abstract class SubClass extends AbstractPractices{

  /*  @Override
    void dispaly() {
        // TODO Auto-generated method stub
        
    }*/

    @Override
    void method() {
        // TODO Auto-generated method stub
        
    }
    SubClass(){
        super(3);
    }

 }
public class AbstractClasses extends SubClass{
     void dispaly(){
       System.out.println("Dispaly method");
    }
    void method(){
        System.out.println("dispaly another abstract method");
    }
    public static void main(String[] args) {
        AbstractPractices obj = new AbstractPractices(){
            void dispaly(){
                System.out.println("method implementation");
            }
             void method() {
             System.out.println("implementation of abstract method");
                
            }
        };
        obj.dispaly();
        AbstractPractices.methodStatic();
        obj.methodDispaly();
        obj.method();
        AbstractClasses abObj = new AbstractClasses();
        abObj.dispaly();
        AbstractClasses.methodStatic();
        abObj.methodDispaly();
        abObj.method();
    }
}

package OopsConcepts;

public  abstract class AbstractClass {
    int ab;
    abstract  void display(int i,String st);
    
    public static void main(String[] args) {
        
    }

}


abstract class Abstract extends AbstractClass{

    //if an abstract class extends an abastract class,,all the abstract methods need not be implemented

   int a;
   static String name;


    void localMethod(){

        this.show(10);
        this.pro();
        Abstract.stat();
        
        AbInner1 objAbInner1 = new AbInner1();    // inner class obj
        //AbInner2 objAbInner2 = new AbInner2();   //-------->error-- abstract class obj
          objAbInner1.inner1();  
        System.out.println("local method");
    }

    private void show(int h){
      System.out.println("in private");
    }

    protected void pro(){
        
      System.out.println("in protected");
    }

    static  void stat(){

        System.out.println("static");
    }

    class AbInner1 extends Abstract{      //nested  inner class

        void display(int i, String st){
            System.out.println("abstract method in inner non abstract subclass");

        }

        void inner1(){
            System.out.println("ab inner");
        }
        

    }

    abstract class AbInner2 extends Abstract{    //nested  inner abstract  class

        public static void main(String[] args) {   // no "run"
   
        }

    }
  
}
class NonAbstract extends AbstractClass{

    //if a non abstract class extends an abastract class,,all the abstract methods must be 
    //implemented in its own class -----or it throws error


    void display(int i, String st){
        this.ab=10;
        i=20;
        st="uma";
        System.out.println(i+" "+ab+" "+st);
    }

    public static void main(String[] args) {
        

        NonAbstract objNonAbstract = new NonAbstract(); //one way of calling abstract class methods
        objNonAbstract.display(10, "ram");

        AbstractClass obj = new NonAbstract();     //second way 
        obj.display(10, "uma");
        
    }
}
class NonAbstract1 extends Abstract{

    void display(int i,String st){
        System.out.println("non abstract 1");
    }

    public static void main(String[] args) {


        NonAbstract1 objNonAbstract1 = new NonAbstract1();
        objNonAbstract1.localMethod();
        
    }


}
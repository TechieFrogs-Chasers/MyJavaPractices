package OopsConcepts;

public class InheritConstructors {
    String s;
   int num;
    InheritConstructors(){
    System.out.println("constructor in inherit");
    }

     public InheritConstructors(int i){

        num=10;
        i=10;
        System.out.println(num);
    }
    private InheritConstructors(String s){
        System.out.println(" private constructor");
    }
    protected InheritConstructors(boolean b){

        this("sam");
        System.out.println("protected");
    }
    //can not have static constructors because static constructors do not need object

}
class Sedan extends InheritConstructors{

    void display(){
        System.out.println("method in sedan");
    }

    Sedan(){
     
        System.out.println("constructor in sedan");
    }
     Sedan(int k){
     
        super(true);
       // super("uma")    //error --------> can not call private constructors from the parent class
       num=20;
        System.out.println("int in sedan  "+this.num+" "+super.num);
     }

     static void hi(){
         System.out.println("static in sedan");
     }
     

}
class Suv extends Sedan{

    Suv(){
       
        System.out.println("constructor in suv");
        
    }
    Suv(int j){
        super(20);
        num=30;
    System.out.println("int in suv"+this.num+" "+super.num);
    }
     protected void display(){
        
        System.out.println("method in suv");
        
    }
    static void hi(){
        System.out.println("static in suv");
    }

}
class Hybrid extends Suv{


    Hybrid(){
        super(10);
        System.out.println(" constructor in hybrid"+this.num+" "+super.num);
    }

    public static void main(String[] args) {

        Hybrid objHybrid = new Hybrid();
        objHybrid.display();
        System.out.println(objHybrid.num);
        Sedan.hi();

    }

}

package OopsConcepts;

public interface ReturnInterface {

    String given();

    // int given(); even though return type is different ,same name is not allowed

    int give();

    static int stat(){
       return 0;
    }
    static  int stat1(int i){
       System.out.println("first static with one arg");
       return 0;
    }

    default int def(int i,String name){
       System.out.println(" first default with two args");
       return 0;
    }
}
interface ReturnInterface1{

    static int stat1(int j){
        System.out.println("second static");
        return 0;
    }

    default int def(String name){
     System.out.println("second default");
        return 0;
    }
     int give();

     // ReturnInterface1(){} // interfaces can not have constructors
        
     
}

class TestReturnInterface implements ReturnInterface,ReturnInterface1{

    //duplicate default methods in both the interfaces with same no of parameters

    //static methods are not inherited but does not throw duplicate error

    
    public String given() {
    
        return null;
    }

   
    public int give() {
       
        return 0;
    }

    public static void main(String[] args) {
        
        ReturnInterface obj = new TestReturnInterface();    //**************** */

        obj.def(10, "uma");   // default method from first interface
        
        ReturnInterface1.stat1(10);  // static method from second interface
    }
    
}
class Test implements ReturnInterface{


    //public static void accept(ReturnInterface()){   // misplaced constructs

   //}

    public static void main(String[] args) {
    
    }
    public String given() {
       
        return null;
    }
    public int give() {
        
        return 0;
    }
    
}
class Tester {

    public static void main(String[] args) {


        Tester objTester = new Tester();
        objTester.local();
        
        ReturnInterface objInterface = new ReturnInterface(){

            
            public String given() {
                
                return null;
            }

           
            public int give() {
                
                return 0;
            }
            
            
        };
         objInterface.def(10, "varsha");
    }
         void local(){
            ReturnInterface objInterface = new ReturnInterface(){

            
            public String given() {
                
                return null;
            }

           
            public int give() {
                
                return 0;
            }
            
            };
        

          objInterface.def(10, "ram");
        }

    class Inner implements ReturnInterface{

        
        public String given() {
           
            return null;
        }

        public int give() {
           
            return 0;
        }
        

    }
}
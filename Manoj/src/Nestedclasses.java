public class Nestedclasses {

    class Inner{       //inner class or nested class

        void  innerMethod(){
            System.out.println("inner class method ");
        }

    }
    void outerMethod(){
        System.out.println("outer class method ");
        Inner innerobj=new Inner(); //calling a inner class method from instance method 
        innerobj.innerMethod();

    }
     public static void main(String...args){
         Nestedclasses outerobj=new Nestedclasses();
         outerobj.outerMethod();
         Nestedclasses.Inner innerobj=new  Nestedclasses(). new Inner(); //calling a inner method from static method 
         innerobj.innerMethod();
     }

}

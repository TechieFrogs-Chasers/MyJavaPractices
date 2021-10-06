abstract class Abstractclass {

    abstract void display1();

    abstract void display2();

    void displaymeth(){
        System.out.println("Abstract class displaymeth");
    }

    static void displaymeth2(){
        System.out.println("Abstract class static  displaymeth2");
    }   

    final void displaymeth3(){
        System.out.println("Abstract class final displaymeth3");
    }
}
//we can't able to create the instance for abstract class for we need to extend the class


class Abstractclass2 extends Abstractclass{ //not able to  have abstract method in abstract class
    
//for to access the abstract methods we have create the same methods in child class without abstract
//if we have n no of abstract methods we need to create n no of methods in child class 
     void display1(){

     }
     void display2(){

     }
public static void main(String...args){

  //  Abstractclass obj=new Abstractclass();
   Abstractclass2 obj=new Abstractclass2();
   obj.displaymeth();
   obj.displaymeth2();
   obj.displaymeth3();

}
}
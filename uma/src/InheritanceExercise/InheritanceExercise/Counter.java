package InheritanceExercise;


// 7th question from inheritance excercise

public class Counter {


    static int i;

    void increment(){
        i=3;
        System.out.println("i = "+i);
    }
    
}
class Subcounter extends Counter{
    public static void main(String[] args) {
        Subcounter objSubcounter = new Subcounter();
        objSubcounter.increment();
       // System.out.println(Counter.i);

    } 
}
//------------------------------------------------------------------------------------------------------------
// 8th question from inheritance excercise

class A{

    int i,j;
    A(){

    }
    void show(){
        this.i=10;
        this.j=20;
        System.out.println( this.i+" "+this.j);
    }

}
class B extends A{

    int k=25;
     
    B(){

        super();
    }

    void show(){
    
        System.out.println(this.k);
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }

}
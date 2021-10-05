package OopsConcepts;

public class Inherit{

    private int bonds;
    String sites;
    int apts;

    void property(){

        System.out.println("main property");
    }

    public int getbonds(){
        bonds=10000;
        return bonds;
    }

    static void display(){
        System.out.println("static method");
    }

    static class StaticClass{       // static class in outer class
        int plots;
        String name;
    }


}
class Grand1 extends Inherit{

    int apt1;

    void oneGrand(){
        System.out.println(" first grand ");
    }

    public static void main(String[] args) {
 
        Inherit inheritobj = new Inherit();  //by creating obj of other class ,calling  parent methods
        inheritobj.getbonds();
        inheritobj.property();

        Inherit.display();   //static method

        Grand2  objGrand2 = new Grand2();  
        objGrand2.twogrand();

       //by creating an object you can call methods from another child class.
       //but can not call directly with inheritance 
    }
}
class Grand2 extends Inherit{
    int apt2;

    void twogrand(){
        System.out.println("second grand");
    }
    public static void main(String[] args) {
      
        Grand2 objGrand2 = new Grand2();    //creating obj of own class , we can call parent methods
       objGrand2.property();
       objGrand2.getbonds();

       Inherit.display();

        
    }
}
class Son1 extends Grand1{
int k;

public static void main(String[] args) {
    

Son1 objSon1 = new Son1();
System.out.println(objSon1.sites);
 Inherit.display();

}
}

//class  Son1 extends Grand2{   // can not do  multiple inheritance

//}
class Grandson extends Son1{

    int g;

    public static void main(String[] args) {
        
        Grandson objGrandson = new Grandson();
        objGrandson.property();
        objGrandson.oneGrand();
    }

         
}
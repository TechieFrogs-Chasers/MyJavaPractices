package Praticenew;

public class Nested2 {
    int outer_x=45;
    String name="Manoj";
    static int y=100;

     class Inner{      //created inner classs
        static int j=10; 
         void display(){
             System.out.println("display :outer_x"+" - "+outer_x+" "+name+" "+y);
         }

     }
     void outer(){
         Inner innerobj=new Inner(); //called the inner one
         innerobj.display();

     }
     public static void main(String...args){
        // Nested2 obj=new Nested2();   //called the outer one 
         //obj.outer();
         Nested2.Inner obj2=new Nested2().new Inner();
         obj2.display();

     }
    
}

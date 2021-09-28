package Praticenew;

public class Nested2 {
    int outer_x=45;
    String name="Manoj";

     class Inner{      //created inner classs 
         void display(){
             System.out.println("display :outer_x"+" - "+outer_x+" "+name);
         }

     }
     void outer(){
         Inner innerobj=new Inner(); //callled the inner one
         innerobj.display();

     }
     public static void main(String...args){
         Nested2 obj=new Nested2();   //called the outer one 
         obj.outer();

     }
    
}

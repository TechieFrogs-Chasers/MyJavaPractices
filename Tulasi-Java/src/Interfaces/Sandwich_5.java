package Interfaces;

interface FastFood{
   void taco();
   void drinks();

}
class tacobell implements FastFood{
   @Override
   public void taco() {
      System.out.println("Tacos");
   }

   @Override
   public void drinks() {
      System.out.println("Cold drinks");
   }
}
public class Sandwich_5 {
   public static void main(String[] args) {
      FastFood obj = new tacobell();
      obj.taco();
      obj.drinks();
   }
}

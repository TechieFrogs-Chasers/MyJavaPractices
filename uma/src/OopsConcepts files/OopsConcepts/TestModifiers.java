package OopsConcepts;

public class TestModifiers {
      int i;
      boolean b;

       private float f=20.0f;

       static String place;
      static final float PI=3.14f;

     public static void main(String[] args) {
         

      TestModifiers obj = new TestModifiers();
      System.out.println(obj.f);
 

        AccessModifiers access = new AccessModifiers();
        access.i=10;
        


     }

   void dis(){
      System.out.println(f);
   }
}
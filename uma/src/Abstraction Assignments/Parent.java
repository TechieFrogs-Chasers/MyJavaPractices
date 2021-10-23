

public abstract class Parent {
    
   void message(){

   }
   
   class SubParent1{

      void message(){
         System.out.println(" This is the first sub class");

      }
   }
   class SubParent2{

      void message(){
         System.out.println("This is the second subclass");

      }
   }

   public static void main(String[] args) {
      
   Parent objParent = new Parent(){
      void message(){
         System.out.println("this is abstract method");
      }
   };

      objParent.message();


      SubParent1  obj = objParent.new SubParent1();

      obj.message();

      SubParent2 objParent2 = objParent.new SubParent2();
      objParent2.message();

   }
}


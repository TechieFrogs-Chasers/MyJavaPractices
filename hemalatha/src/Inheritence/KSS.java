package Inheritence;
/*class D
{
    int a,b;
    void m1(){
        System.out.println("first class");
    }
}
    class B extends D{
        int c;
        void m2()
        {
            System.out.println("second class");
        }
    }
    class C extends B{
        void m3()
        {
            System.out.println("third class");
        }
    }

public class KSS {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}*/
 class Fruits
 {
     void eat()
     {
         System.out.println("juice");
     }
    }
     class Apple extends Fruits{
         void colour2()
         {
             System.out.println("red colour");
         }
     }
     class Mango extends Fruits{
         void colour1()
         {
             System.out.println("yellow");
         }
          void eat()
         {
             System.out.println("mango juice");
            
         }
        
     
     public class Heirarchical {
         public static void main(String[] args) {
             Mango mango = new Mango();
             mango.eat();
             //m.colour2();
             mango.colour1();
         }
     }
 }

    


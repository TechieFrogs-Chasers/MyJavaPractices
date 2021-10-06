package sindhu.src;
 /*class grandInheritance{
    
   protected int k=30;

static class staticInh{
        static int g;
        {
            g=6;
        }
        
        static boolean hi(){
            System.out.println("method");
            return false;

        }


    }
}*/


public class Inheritance {

   protected int i=10;
    String name1 ="sindhu";
    int age;

     static void hi(){
        System.out.println("static");
    }
   
    
}

class subInheritance extends Inheritance{
    int j = 15;
    int id = 242;
    String name1= "haya";

   static  void hi(){
        System.out.println("static");
    }





public static void main(String[] args) {
    subInheritance x = new subInheritance();
    System.out.println(x.i);
    System.out.println(x.name1);
    subInheritance.hi();

    Inheritance a2 = new subInheritance();
    System.out.println(a2.name1);
    
}

}

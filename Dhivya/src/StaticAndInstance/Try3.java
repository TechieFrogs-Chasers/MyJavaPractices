package StaticAndInstance;

public class Try3 {
     Try3(){
         System.err.println("constructor");
     }
     static {
         System.out.println("static");
     }
     {
         System.out.println("non static");
     }
     public static void main(String[] args) {
        Try3 obj = new Try3();
         System.out.println("main method");
         
         Try3 obj2 = new Try3();

     }


}

public class StringDoubts {

    public static void main(String[] args) {
        
    
    String a = "love";
    String b ="you";

    System.out.println(a+" "+b);

    a=a+b;
   //b=string(a-b);
   System.out.println(a);
  
   b=a.substring(0,a.length()-b.length());
  // a=a.substring(b.length());
   System.out.println(b);
    System.out.println(a.substring(4));
 
    
    }
    
}

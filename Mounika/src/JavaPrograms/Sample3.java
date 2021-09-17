package JavaPrograms;
public class Sample3 { 
  static public void main(String[] args)
  {
    
   main("abc","xyz","bcd");
   main(10,20,30);
   
  }
 public static void main(String a, String b, String c) 
 {
   System.out.println(a + "  " +b +" "+c);
 }

 public static void main(int a, int b, int c) 
 {
   System.out.println(a + "  " +b + " " + c);
   System.out.println(a + "  " +b + " ");
 }
 
}
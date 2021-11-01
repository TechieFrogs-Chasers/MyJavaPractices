public class Typecasting2 {
    //narrow typecasting in this some data occur 
    public static void main(String[] args)
    {
      double d = 100.04;
      long l = (long)d;  //explicit type casting required
      int i = (int)l; //explicit type casting required
      short s=(short)i;

      System.out.println("Double value "+d);
      System.out.println("Long value "+l);
      System.out.println("Int value "+i);
      System.out.println("short value "+s);
    }

}
    


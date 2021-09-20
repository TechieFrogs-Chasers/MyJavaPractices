import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
     /*   double a=12;
        double b=14;
        double quotient = a/b;
        double remainder = a%b;
        System.out.println("The quotient is"+"  "+ quotient);
        System.out.println("The remainder is"+"  "+remainder);
        System.out.println("The quotient and remainder is"+"  "+"quotient="+ quotient +" and  "+ "remainder "+ remainder);
*/
   /* float x=9.5f;
    float y=2.5f;
    System.out.println("The quotient is"+"  "+ (x/y));
    System.out.println("The quotient is"+"  "+ (x%y));
    System.out.println("The quotient and remainder is"+"  "+"quotient="+ (x/y) +" and  "+ "remainder "+ (x%y));
*/
      Scanner Obj = new Scanner(System.in);
      int a;
      int b;
        do
        {
          System.out.println("Find Quotient and Reminder");
      
      
                if(!Obj.hasNextInt())
                    {
                      Obj.next();
                    a = Obj.nextInt();
                    b= Obj.nextInt();
                      System.out.println("The quotient and remainder");
                          if(((a/b)==3 ) && ((a%b)==0))
                          {
                            System.out.println("The quotient and remainder is"+"  "+"quotient="+ (a%b) +" and  "+ "remainder "+ (a/ b));
                          }
                          else
                          {
                            System.out.println("Print Correct Values");
                          }
                    }
                    else
                    {
                      System.out.println("Print Valid Numbers");
                    }
                
                    a = Obj.nextInt();
        }while(a<=10);
        Obj.close();
        System.out.println("Print Integers");
      }

}

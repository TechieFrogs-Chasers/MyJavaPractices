import java.util.Scanner;
public class Armstrongnum {
    public static void main(String...args){
      Scanner object=new Scanner(System.in);
      int num;
      int check ,rem, sum=0;
      do {
          System.out.println("enter the number");
          while(!object.hasNextInt())
          {
              String s=object.next();
              System.out.println( s+ "this is not a number please enter a valid one");
          }num=object.nextInt();
      }while(num<=0);

      check=num;
      while(check!=0);{
          rem=check%10;
          sum=sum+( rem *rem* rem);
          check=check/10;
      }
      if (sum==num){
      System.out.println("given number is an armstrong num");
      }else {
      System.out.println("given number is not an armstrong num");
      }
      object.close();
    }
    
}

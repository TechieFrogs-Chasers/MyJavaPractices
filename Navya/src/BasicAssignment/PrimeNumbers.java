  package BasicAssignment;

  import java.util.Scanner;

  public class PrimeNumbers {
      public static void main(String[] args) {    
      Scanner myObj = new Scanner(System.in); // creating scanner object
      //System.out.println("Enter positive Number:");
      int num , count = 0;
      do{
        System.out.println("please enter a positive number:");
          while (!myObj.hasNextInt()) { // if object was not an integer than goes to print Statement
            String input = myObj.next(); // to print String from end user
            System.out.println( input +"  This is an valid number,please enter valid number");
          }
            num = myObj.nextInt();
        }
          while( num <= 0);
          myObj.close();
          if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                count++;
             }
            if(count==2)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("is not a prime number");

            }
        }
        else
        {
            System.out.println("is not a prime number");
        }
    }
  }
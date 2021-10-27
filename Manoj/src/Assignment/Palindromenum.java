package Assignment;
import java.util.Scanner;
public class Palindromenum {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        int num;
        int sum=0;
        do {
            System.out.println(" enter the positive number ");
            while(!object.hasNextInt())
            {
                String s= object.next();
                System.out.println(s+ "this is not a number ,enter valid one");
            }num=object.nextInt();
        }while(num<=0);

        
         int temp=num;
          while (num>0){
              sum=sum*10+ num%10;
              num = num/10; 
          }
          System.out.println(sum);
          if (temp==sum)
          {
              System.out.println("its a palidrome ");
          }
          else
          {
              System.out.println("its not a palindrome ");
          }
          object.close();
            
    }

    
}

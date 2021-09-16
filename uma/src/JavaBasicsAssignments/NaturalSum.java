package JavaBasicsAssignments;
import java.util.Scanner;
public class naturalSum {
    public static void main(String[] args) {
        
    

  System.out.println("Find the sum of given numbers");

       Scanner scannerObj = new Scanner(System.in);   
        
       int num;
       int sum=0;
       int i;
        do{
            System.out.println("enter your number:");

           while(!scannerObj.hasNextInt() ){
            scannerObj.next();

               System.out.println("  is not a valid type");
          }
             num=scannerObj.nextInt();
          } while(num<=0);

             scannerObj.close();    
          for( i=1;i<=num;i++)
        { 
            sum= sum+ i;
        }
       System.out.println("The sum of the natural numbers  " +num+ "  is:  "+sum);
       
        
    
    
    }

}
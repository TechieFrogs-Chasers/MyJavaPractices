package JavaBasicsAssignments;
import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        
    

  System.out.println("Find the sum of given numbers");

       Scanner NaturalSumobj = new Scanner(System.in);   
        
       int num;
       int sum=0;
       int i;
        do{
            System.out.println("enter your number:");

           while(!NaturalSumobj.hasNextInt() ){
            NaturalSumobj.next();

               System.out.println("  is not a valid type");
             }
             num=NaturalSumobj.nextInt();
             } while(num<=0);


          for( i=1;i<=num;i++)

        { 
            sum= sum+ i;
        }
       System.out.println("The sum of the natural numbers  " +num+ "  is:  "+sum);
       
         NaturalSumobj.close();
    
    
    }

}
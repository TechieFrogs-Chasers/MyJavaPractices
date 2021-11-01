//import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
    
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the numbers to sum : ");
        int num,num1, sum;
       // num = scannerObj.nextInt();
       // num1 = scannerObj.nextInt();
        try {
            num = scannerObj.nextInt();
            num1 = scannerObj.nextInt();
            sum = num + num1;
            System.out.println("Sum of numbers : " + sum);
        }
        catch (Exception ex)
        {
            
            System.out.println(ex);
             
        }
        finally{
          
         System.out.println("Sum of Integer value using exception!");
        
        }

         scannerObj.close();
    }
}
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println(" try without catch/finally block ");
        }


       // ***************
       //throwing exception explicitly

        try
        {
            // Creating an object of ArithmeticException
            ArithmeticException ae = new ArithmeticException();
            //Manually throwing ArithmeticException
            throw ae;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Caught the manually thrown Exception");
        }


        //******************************* */

        //catch block rethrowing an exception

        try
        {
            // Creating an object of ArithmeticException
            ArithmeticException ae = new ArithmeticException();
            //Manually throwing ArithmeticException
            throw ae;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Rethrowing the caught exception below "); 
            //Rethrowing ArithmeticException 
            throw e;
        }
    }
    
}

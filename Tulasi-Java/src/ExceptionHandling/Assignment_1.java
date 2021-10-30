package ExceptionHandling;


import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        int num, num1, sum;
        System.out.println("Enter the numbers to sum : ");
        Scanner scannerObj = new Scanner(System.in);
        num = scannerObj.nextInt();
        num1 = scannerObj.nextInt();
        try {
            sum = num + num1;
            System.out.println("Sum of numbers : " + sum);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        finally
        {
            System.out.println("Sum of Integer value using exception!");
            scannerObj.close();
        }

    }
}

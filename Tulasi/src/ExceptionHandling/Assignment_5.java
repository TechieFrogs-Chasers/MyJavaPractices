package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) throws InputMismatchException,ArithmeticException ,Exception{
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the number :");
        try {
            int num=scannerObj.nextInt();
            int sum=num/00;
            System.out.println("");
        }catch (InputMismatchException ie) {
            System.out.println(ie.getMessage());
            throw new ArithmeticException("sum cant divided by 0");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Final statement!");
            scannerObj.close();
        }
    }
}

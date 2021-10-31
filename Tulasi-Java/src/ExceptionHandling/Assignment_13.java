package ExceptionHandling;

import java.util.Scanner;

public class Assignment_13 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num=scannerObj.nextInt();
        int num1=scannerObj.nextInt();
        int sum;
        try{
            sum=num/num1;
            System.out.println("Sum: "+sum);
            System.out.println(sum/0);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
    }
}

package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_22 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num=scannerObj.nextInt();
        int num1=scannerObj.nextInt();
        int sum,sub,div,total;
        try {
            sum=num+num1;
            total=sum%2;
            System.out.println(sum);
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        try {
            sub=num-num1;
            total=sub/2;
            System.out.println(sub);
        }catch (NegativeArraySizeException ne){
            System.out.println(ne.getMessage());
        }
        try{
            div=num/num1;
            total=div%2;
            System.out.println(div);
        }catch (InputMismatchException nme){
            nme.printStackTrace();
        }finally {
            System.out.println("final statement!");
            scannerObj.close();
        }
    }

}
package ExceptionHandling;

import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num=scannerObj.nextInt();
        int num1=scannerObj.nextInt();
        methodOfThrows(num,num1);
        scannerObj.close();

    }
    public static void methodOfThrows(int num,int num1) throws ArithmeticException{
        if(num1<0){
            throw new ArithmeticException("Cant multiply with 0 ");
        }else {
            System.out.println("Multiplication of num and num1 :"+num*num1);
        }

    }
}

import java.util.Scanner;

public class Mscanner{
    public static void main(String...args){
        Scanner scannerObj=new Scanner(System.in);
        System.out.println(" enter the value of num 1 : ");
        int num1 = scannerObj.nextInt();
        System.out.println("enter the value of num 2 :  ");
        int num2 = scannerObj.nextInt();
        
        int sum = num1 + num2;
        System.out.println("sum of two numbers : " + sum );
        scannerObj.close();

    }
}
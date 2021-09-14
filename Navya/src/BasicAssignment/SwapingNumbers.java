package BasicAssignment;

import java.util.Scanner;

public class SwapingNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num1 = SwapingNumbers.validateSwaping(myObj);
        System.out.println("A= "+num1);
        int num2 = SwapingNumbers.validateSwaping(myObj);
        System.out.println("B= "+num2);
        System.out.println("original numbers: "+num1+" "+num2);
         num1 = num1 -num2;// if num1=10 - 20 = -10 ;
         num2 = num1 + num2;// if num2 = -10 + 20 = 10;
         num1 = num2 - num1;// if num1 = 10-(-10) = 20;
         System.out.println("After swaping:" + num1 +" "+ num2);
    }
    static int validateSwaping(Scanner myObj){
    int num;
    do{
        System.out.println("Enter positive Number:");
        while(!myObj.hasNextInt()){
            String input = myObj.next() ;
            System.out.println(input+" This is not a Number.Please enter positive Number:");
            myObj.next();
        }
        num = myObj.nextInt();
    }while(num <= 0);
    return num;
    }
}

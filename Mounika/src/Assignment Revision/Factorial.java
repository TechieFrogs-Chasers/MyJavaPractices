import java.util.Scanner;

import Strings.String;

public class Factorial {
    public static void main(String[] args) {
        int num1;
       int num2=1;
       int fact=1;
        Scanner scObj = new Scanner(System.in);

        //num1 =scObj.nextInt();

        do{
            System.out.println("Enter value of num1");
            int num;
            while(!scObj.hasNextInt()){
                    String input = scObj.next();
                    System.out.println("Not a valid Number");
            }
            num1 =scObj.nextInt();
                for(num2=1;num2<=num1;num2++){
                    fact = fact*num2;
                }
                System.out.println(" Factorial of num1 is "+fact);
        }while(num1<=0);
        scObj.close();
    }
    
}

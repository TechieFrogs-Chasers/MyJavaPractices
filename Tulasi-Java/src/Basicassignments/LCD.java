package Basicassignments;

import java.util.Scanner;

public class LCD {
    public static void main(String[] args) {
        Scanner myScannerObj=new Scanner(System.in);
        int num1,num2,lcd=1,gcd=1;

        do{
            System.out.println("Please enter a positive number1! ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("That's is not a number");
            }
            num1=myScannerObj.nextInt();
        }while (num1<=0);

        do{
            System.out.println("Please enter a positive number2! ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("That's is not a number");
            }
            num2=myScannerObj.nextInt();
        }while (num2<=0);
        myScannerObj.close();//Scanner Close

        int HighNo =  num1<num2?num2:num1;
        int LeastNo = num1<num2?num1:num2;

        for (int i = num1 * num2; i >= HighNo; i--) {
            if (i % num1 == 0 && i % num2 == 0)
                lcd = i;
        }
        int j = 1;
        while ( j <= LeastNo) {

            if (num1 % j == 0 && num2 % j == 0)
                gcd = j;
            j++;
        }
        System.out.println("LCD of given numbers is:"+lcd);
    }
}

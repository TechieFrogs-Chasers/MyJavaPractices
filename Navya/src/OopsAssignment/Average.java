package OopsAssignment;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int a = Average.validatePositiveNumber(myScannerObj);
        System.out.println("print the value of first : "+ a);
        int b = Average.validatePositiveNumber(myScannerObj);
        System.out.println("print the value of second number : "+b);
        int c = Average.validatePositiveNumber(myScannerObj);
        System.out.println("print the value of second number "+c);
        int average = ((a+b+c)/3);
        System.out.println("print the average value : "+average);
    }
    static int validatePositiveNumber(Scanner myScannerObj){
    int num;
        do{
            System.out.println("Enter positive Number:");
            while(!myScannerObj.hasNextInt()){
                System.out.println("This is not a Number.Please enter positive Number:");
                myScannerObj.next();
            }
            num = myScannerObj.nextInt();
        }while(num <= 0);
      return num;
    }
}

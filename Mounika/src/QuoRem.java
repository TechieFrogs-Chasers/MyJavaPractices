import java.util.Scanner;

public class QuoRem {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
            System.out.println("Enter value for num1");
            int num1 = scObj.nextInt();
            System.out.println("Enter value for num1");
            int num2 = scObj.nextInt();
            int reminder = num1%num2;
            scObj.close();
            System.out.println("Reminder :"+reminder);
            int quotient = num1/num2;
            System.out.println("Quotient :"+quotient);
    }
}
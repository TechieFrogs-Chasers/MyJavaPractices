package BasicAssignment;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int num;
        int reminder, sum = 0;
        

        do {
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println( input+ "That's not a number!");
            }
            num = myScannerObj.nextInt();
            
        }
        while (num <= 0);
        int temp = num;
        while (num > 0) {
            reminder = num % 10;
            num = num / 10;
            sum = (sum* 10) + reminder;
            
        }
        if (temp == sum)
            System.out.println("Its a Palindrome number !");
        else
            System.out.println("Its not a Palindrome number !");
        myScannerObj.close();
    }
}

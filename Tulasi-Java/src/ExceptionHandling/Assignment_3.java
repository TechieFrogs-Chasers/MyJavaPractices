package ExceptionHandling;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the ticket price: ");

        try {
            int price=scannerObj.nextInt();
        if(price<20) {
            throw new NumberFormatException("Second class ticket!");//The throw keyword is used to explicitly throw a single exception.-new – java keyword to create a new exception.
        }else {
            System.out.println("First class ticket!");
        }

    }finally {
            System.out.println("Final statement!");
            scannerObj.close();
        }
    }

}

package TCS_NQT;//Package

import java.util.Scanner;//Scanner

public class Jar_1 {//driver class

    public static void main(String[] args) {//main method
        int N = 10, K = 5;//variables
        int input;
        System.out.println("Enter a number: ");
        Scanner myScannerObj = new Scanner(System.in);//scanner
        input = myScannerObj.nextInt();
        myScannerObj.close();//scanner closed
        if (input >= 1 && input <= 5) {
            System.out.println("No.of Candies Sold : " + input);
            System.out.print("No.of Candies Left : " + (N - input));
        } else {
            System.out.println("Invalid Input");
            System.out.print("No.of Candies Left : " + N);
        }
    }
}


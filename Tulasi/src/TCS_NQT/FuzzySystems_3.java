package TCS_NQT;

import java.util.Scanner;

public class FuzzySystems_3 {
    public static void main(String[] args) {
        int input;

        System.out.println("Enter the input :");
        Scanner myScannerObj = new Scanner(System.in);
        input = myScannerObj.nextInt();
        myScannerObj.close();
        if (input > 0 && input <= 2000) {
            System.out.println("For low level water " + input + " . " );
            System.out.println("Time Estimated: 25 minutes");
        } else if (input > 2000 && input <= 4000) {
            System.out.println("For medium level water " + input + " . " );
            System.out.println("Time Estimated: 35 minutes");
        } else if (input > 4000 && input < 7000) {
            System.out.println("For high level water " + input + " . " );
            System.out.println("Time Estimated: 45 minutes");
        } else if (input == 7000) {
            System.out.println("OVERLOADED.");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}

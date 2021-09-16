package Basicassignments;

import java.util.Scanner;

public class InvertedPyramidTriangle {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int num;

        do {
            System.out.println("Please enter the positive number:");//7
            while (!(myScannerObj.hasNextInt())) {//for not to allow characters
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num = myScannerObj.nextInt();

        } while (num <= 0);
        for (int i = num; i >1; i--) {//lines loop
            for (int j =i; j <num; j++) {//space loop
                System.out.print("  ");
            }
            for (int k = 2; k<(2*i-3); k++){//star loop
                    System.out.print(" * ");

            }
            System.out.println();
            myScannerObj.close();//scanner close
        }
    }
}

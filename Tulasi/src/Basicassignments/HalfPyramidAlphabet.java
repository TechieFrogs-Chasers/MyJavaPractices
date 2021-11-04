package Basicassignments;

import java.util.Scanner;

public class HalfPyramidAlphabet {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int i, j;
        int rows;
        int letters = 64;
        System.out.println("  --Create Half Pyramid with Alphabets-- ");
        System.out.println();

        System.out.println("Enter a number, how many lines you want : ");
        do {
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNext()) {//for not to allow num
                int input = myScannerObj.nextInt();
                System.out.println("Its not a valid number!");
            }
            rows = myScannerObj.nextInt();

        } while (rows <= 0);//do loop close with while
        System.out.println(" Pyramid details : ");

        for (i = 1; i <= rows; i++) {//rows loop
            for (j = 1; j <=i ; j++) {//letters loop
                System.out.print((char) (j + letters));
                System.out.print(" ");
            }
            System.out.println();
            myScannerObj.close();//scanner close
        }
    }
}

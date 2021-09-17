package Basicassignments;

import java.util.Scanner;

public class StarTraingle {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
       // int i, j;//i=lines,j=space,stars
        int lines;
        System.out.println("  --Create Half Pyramid with numbers-- ");
        System.out.println();

        do {
            System.out.println("Please enter a positive number! ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("Its not a number ");
            }
            lines = myScannerObj.nextInt();

        } while (lines <= 0);

        for (int i =1; i<=lines; i++) {//lines
            for (int j=lines-i; j> 0; j--) {//space
                System.out.print("  ");
            }
            for (int j=1; j<=(i*2)-1; j++) {//stars
                System.out.print("* ");
            }
            System.out.println();
            myScannerObj.close();//scanner close
        }
    }
}


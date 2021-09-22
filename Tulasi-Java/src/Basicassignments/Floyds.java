package Basicassignments;

import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int lines, rows, spaces, num=1;

        do {//Validation
            System.out.println("Please entry a positive number: ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("That is not a number: ");
            }
            lines = myScannerObj.nextInt();
        } while (lines <= 0);

        for(rows=1;rows<=lines;rows++){
            for (spaces=1;spaces<=rows;spaces++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
            myScannerObj.close();//scanner close
        }
    }
}
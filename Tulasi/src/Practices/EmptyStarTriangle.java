package Practices;

import java.util.Scanner;

public class EmptyStarTriangle {
    public static void main(String[] args) {
        Scanner myScannerObj=new Scanner(System.in);
        int num;
        int row,spaces,star;
        do {
            System.out.println("Enter a positive number:");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("Its not a number!");
            }num=myScannerObj.nextInt();
        }while (num<=0);

        for (row=1;row<=num;row++){
            for (spaces=1;spaces<=(num-row)+1;spaces++) {
                System.out.print(" ");
            }
            for (star=1;star<=(row-1);star++){
                System.out.print(" * ");
            }
            System.out.println();
            myScannerObj.close();
        }
    }
}

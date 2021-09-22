package Basicassignments;

import java.util.Scanner;

public class SandGlassStar {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int num;
        int rows, spaces, stars;
        Scanner myScannerobj = new Scanner(System.in);

        do {//data validation
            System.out.println("Enter a positive number: ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("Its not a number!");
            }
            num = myScannerObj.nextInt();
        } while (num <= 0);

        for (rows = 1; rows <= num; rows++) {
            for (spaces = 1; spaces <= (rows + 1); spaces++) {
                System.out.print(" ");
            }
            for (stars = 1; stars <= (num - rows) + 1; stars++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (rows = 1; rows <= num; rows++) {
            for (spaces = 1; spaces <=(num-rows)+2; spaces++) {
                System.out.print(" ");
            }
            for (stars = 1; stars <= (rows + 1)-1; stars++) {
                System.out.print(" * ");
            }
            System.out.println();
            myScannerObj.close();//Scanner closing
        }

    }
}


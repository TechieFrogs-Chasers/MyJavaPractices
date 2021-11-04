package Basicassignments;

import java.util.Scanner;

public class DiamondStarShap {

        public static void main(String[] args) {

            Scanner myScannerObj = new Scanner(System.in);

            int num ;
            int rows, space, stars;

            do {
                System.out.println("Please enter a positive number! ");
                while (!(myScannerObj.hasNextInt())) {
                    String input = myScannerObj.next();
                    System.out.println("Its not a number ");
                }
                num = myScannerObj.nextInt();

            } while (num <= 0);

            for (rows = 1; rows <= num; rows++) {
                for (space = 1; space <= (num - rows); space++) {
                    System.out.print(" ");
                }
                for (stars = 1; stars <= (rows * 2) - 1; stars++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            for (rows=1;rows<=num-1;rows++)
            {
                for (space=1;space<=rows;space++)
                {
                    System.out.print(" ");
                }
                for (stars=num*2 ;stars > (rows * 2)+1;stars--)
                {
                    System.out.print("*");
                }
                System.out.println();
                myScannerObj.close();//scanner close
            }
        }
    }


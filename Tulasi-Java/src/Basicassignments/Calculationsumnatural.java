package Basicassignments;

import java.util.Scanner;

public class Calculationsumnatural {
    public static void main(String[] args) {
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        int num = 0,i=1,naturalnum=0;
        System.out.println("Sum of natural number :");
        do {//Validation
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            i = myscannerobj.nextInt();
           // if (i <= 0)
              //  System.out.println("Please enter a positive number! ");
        } while (i <= 0);
        for (i = 1; i < num; i++) {

            while (i <= num) {
                naturalnum =naturalnum+i;
                i++;

            }
        }
        System.out.println(naturalnum);
        myscannerobj.close();//scanner close

    }
}
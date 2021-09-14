package Basicassignments;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        System.out.println("Enter the number for which table to dipaly :");
        Scanner myscannerobj = new Scanner(System.in);
        int table, total, count = 1;
        do {
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            table = myscannerobj.nextInt();

        } while (count <= 0);
        for (count = 1; count <= 10; count++) {
            total = table * count;
            System.out.println(count + " * " + table + " = " + total);
            myscannerobj.close();//scanner close
        }
    }
}
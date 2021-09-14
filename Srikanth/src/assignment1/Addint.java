package assignment1;

import java.util.Scanner;

public class Addint {
    public static void main(String[] args) {
        Scanner Object = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int x = Addint.validate(Object);

        System.out.println("Enter the second Integer: ");
        int y = Addint.validate(Object);

        int sum = x + y;
        System.out.println("Sum of two no is: " + sum);
        Object.close();
    }

    static int validate(Scanner object) {
        int num;

        do {
            System.out.println("Enter a Integer:");
            while (!Object.hasNextInt()) {
                System.out.println("this is not an integer");
                Object.next();
            }
            num = Object.nextInt();
        } while (num <= 0);
        return num;

    }
}

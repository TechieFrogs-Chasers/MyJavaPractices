package Assignment2;

import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("Enter value a: ");
        int a = validate(object);
        System.out.println("Enter value b: ");
        int b = validate(object);
        System.out.println("Enter value c: ");
        int c = validate(object);

        int totalAverage = average(a, b, c);
        System.out.println("AVerage of three no: " + totalAverage);
    }

    static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    static int validate(Scanner object) {
        int num;

        do {
            while (!object.hasNextInt()) {
                object.next();
                System.out.println("this is not an integer");
            }
            num = object.nextInt();
        } while (num <= 0);
        return num;
    }
}

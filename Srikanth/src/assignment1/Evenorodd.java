package assignment1;

import java.util.*;

public class Evenorodd {
    public static void main(String[] args) {

        Scanner Object = new Scanner(System.in);
        int a;

        do {
            System.out.println("Enter the number");
            while (!Object.hasNextInt()) {
                String x = Object.next();
                System.out.println(x + "  is not a valid type");
            }
            a = Object.nextInt();
        } while (a <= 0);

        String min = (a % 2 == 0) ? "even" : "odd";
        System.out.println(min);
        Object.close();
    }
}

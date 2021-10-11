package TCS_NQT;

import java.util.Scanner;

public class PrimeOrNot_12 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int num;
        System.out.println("Enter integer value and a positive number: ");

        do {

            while (!scannerObj.hasNextInt()) {
                String input = scannerObj.next();
                System.out.println("This is not a positive number");

            }
            num = scannerObj.nextInt();

        }
        while (num <= 0);
        scannerObj.close();

        int count = 0;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Its not a prime Number");
        } else {
            System.out.println("Its a prime Number");
        }
    }
}

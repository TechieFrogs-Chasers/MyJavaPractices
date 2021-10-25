package practice;

import java.util.Scanner;

public class calculatesum2 {
    public static void main(String[] args) {
        int i, sum = 0, num = 200;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum:");
        i = sc.nextInt();
        System.out.println("Enter the sum upto:");
        num = sc.nextInt();
        for (i = 0; i <= num; i++) {
            sum = sum + i;
            System.out.println("Sum of natural no: " + sum);

            sc.close();

        }
    }
}

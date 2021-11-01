package ExceptionHandling;

import java.util.Scanner;

public class Assignment_18 {

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scannerObj.nextInt();
        method(age);
    }

    public static void method(int age) {
        try (Scanner scannerObj = new Scanner(System.in)) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cant be less than 0");
            } else {
                System.out.println("Age is correct");
                scannerObj.close();
            }
        } catch (IllegalArgumentException ie) {
            System.out.println(ie);
        } finally {
            System.out.println("Final statement!");

        }
    }
}

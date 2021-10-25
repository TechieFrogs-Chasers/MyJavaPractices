import java.util.Scanner;

//package Tcs.java;

public class Question1 {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Enter no.of candies ordered by customer.");
        int num = objScanner.nextInt();
        objScanner.close();
        int N = 10;
        int k = 4;

        if (num >= 1 && num <= k) {
            int availableCandies = N - num;
            System.out.println("No.of candies sold:" + num);
            System.out.println("No.of candies available" + availableCandies);
        } else {
            System.out.println("Invalid input");
            System.out.println("No.of candies left:" + N);

        }
    }
}

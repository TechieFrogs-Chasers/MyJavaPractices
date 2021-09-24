package practice;

import java.util.Scanner;

public class multiplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(n + "*" + i + " = " + n * i);
            i++;
            sc.close();
        }

    }
}

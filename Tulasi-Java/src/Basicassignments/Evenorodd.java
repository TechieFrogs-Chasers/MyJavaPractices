package Basicassignments;

import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number to check whether a number is Even or Odd :");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(" It's an Even number ");
        else
            System.out.println(" It's an Odd number ");
        sc.close();

    }
}

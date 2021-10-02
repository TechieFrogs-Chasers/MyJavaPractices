package Assignment2;

import java.util.Scanner;

public class AddDistance {
    int i;
    int j;
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b= scanner.nextInt();
        AddDistance addDistance = new AddDistance(a,b);
        System.out.println("Adding Distance"+" "+addDistance.i+" "+addDistance.j);
        scanner.close();

    }

    AddDistance(int x, int y)
    {
        i =x;
        j = y;
    }

}

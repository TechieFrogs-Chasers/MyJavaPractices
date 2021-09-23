import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        long x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n1:");
        x = sc.nextInt();
        System.out.println("Enter another n2: ");
        y = sc.nextInt();
        int n1 = 10;
        int n2 = 10;
        if (n1 > 0 && n2 > 0) {
            while (x != y) {
                if (x > y)
                    x = x - y;
                else
                    y = y - x;

                System.out.println("Gcd of two no is=" + x);
            }
        } else {
            System.out.println("please enter no greater than zero");

            sc.close();
        }
    }
}

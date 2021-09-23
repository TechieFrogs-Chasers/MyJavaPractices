import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int a, b, last, end, lcm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fisrt numbrer:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();

        if (a > b) {
            last = end = a;
        } else {
            last = end = b;
        }
        while (a != 0) {
            if (last % a == 0 && last % b == 0) {
                lcm = last;
                break;
            }
            last += end;
        }
        System.out.println("Lcm of given no:: " + lcm);
        sc.close();
    }
}

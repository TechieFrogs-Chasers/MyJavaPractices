import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner qr = new Scanner(System.in);
        System.out.println("Enter the value for divisor: ");
        int divisor = qr.nextInt();
        System.out.println("Enter the value for divident: ");
        int divident = qr.nextInt();

        int quotient = divident / divisor;
        int remainder = divident % divisor;

        System.out.println("Quotient value: " + quotient);
        System.out.println("Remainder value: " + remainder);
        qr.close();

    }
}

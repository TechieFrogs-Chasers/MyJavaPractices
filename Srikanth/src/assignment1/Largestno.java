import java.util.*;

public class Largestno {
    public static void main(String[] args) {

        Scanner largest = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = Largestno.validate(largest);

        System.out.println("Enter second number");
        int b = Largestno.validate(largest);

        System.out.println("Enter second number");
        int c = Largestno.validate(largest);

        int largestnumber = largest(a, b, c);
        System.out.println("Largest number among all is: " + largestnumber);

    }

    static int largest(int a, int b, int c) {
        int e = a > b ? a : b;
        return c > e ? c : e;
    }

    static int validate(Scanner largest) {
        int num;

        do {
            while (!largest.hasNextInt()) {
                System.out.println("Enter integer");
                largest.next();
                System.out.println("This is not integer, re-enter an integer.");

                System.out.println("");
            }
            num = largest.nextInt();
        } while (num <= 0);
        return num;
    }

}

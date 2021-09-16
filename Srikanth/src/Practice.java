import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 0;

        System.out.println("Enter a value: ");

        a = input.nextInt();

        System.out.println("Entered value: " + a);
        input.close();
    }

    static int validate(Scanner input) {
        int num;

        do {
            while (input.hasNextInt()) {
                System.out.println("Enter a value:");
                input.next();
                System.out.println("This is not correct:");
            }
            num = input.nextInt();
        } while (num >= 0);
        return num;

    }
}

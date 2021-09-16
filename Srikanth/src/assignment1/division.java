import java.util.Scanner;

public class division {

    public static void main(String[] args) {
        double d;
        Scanner object = new Scanner(System.in);

        System.out.println("Enter a integer:");
        int x = division.validate(object);

        System.out.println("Enter another integer:");
        int y = division.validate(object);

        d = x % y;
        System.out.println("Division of two no: " + d);
        object.close();

    }

    static int validate(Scanner object) {
        int num;
        do {

            while (!object.hasNextInt()) {
                System.out.println("This is not accepted.re-enter a number");
                object.next();
            }
            num = object.nextInt();
        } while (num <= 0);
        return num;
    }

}
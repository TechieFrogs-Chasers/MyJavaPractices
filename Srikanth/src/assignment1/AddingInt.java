import java.util.*;

public class AddingInt {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int x = validate(object);

        System.out.println("Enter another value: ");
        int y = validate(object);

        int sum = add(x, y);
        System.out.println("Sum of two no is: " + sum);
        object.close();
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int validate(Scanner object) {
        int num;

        do {
            while (!object.hasNextInt()) {
                object.next();
                System.out.println("this is not an integer");
            }
            num = object.nextInt();
        } while (num <= 0);
        return num;
    }

}
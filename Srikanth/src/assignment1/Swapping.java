import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {

        Scanner swapObj = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a = Swapping.validate(swapObj);
        System.out.println("Enter value for b: ");
        int b = Swapping.validate(swapObj);

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("Swapped given number : a " + a + ",b: " + b);
        swapObj.close();

    }

    static int validate(Scanner swapObj) {
        int num;
        do {
            System.out.println("Enter the positive number:");
            while (!swapObj.hasNextInt()) {
                String e = swapObj.next();
                System.out.println(e + " is not a valid number");
            }
            num = swapObj.nextInt();
        } while (num <= 0);
        return num;
    }

}

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a no to check whether it's a even or odd:");
        number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("The given no is Even");
        } else {
            System.out.println("The given no is odd");
        }
        scanner.close();

    }
}

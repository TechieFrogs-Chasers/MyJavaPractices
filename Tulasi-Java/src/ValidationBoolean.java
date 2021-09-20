import java.util.Scanner;

public class ValidationBoolean {
    static Boolean input;

    public static void main(String[] args) {
        System.out.println("Enter a boolean value:");
        Scanner myScannerObj = new Scanner(System.in);
        if (myScannerObj.hasNextBoolean()) {
            input = myScannerObj.nextBoolean();
            System.out.println("You entered a boolean value " + input);
        } else {
            System.out.println("Please enter a valid value!");
        }
    }
}

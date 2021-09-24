import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter only integer number1: ");
        int x = scannerObj.nextInt();
        System.out.println("Enter only integer number2:");
        int y = scannerObj.nextInt();
        int sum = x + y;
        System.out.println("Adding two integers: " + sum);
        scannerObj.close();
    }
}

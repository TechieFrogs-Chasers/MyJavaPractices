import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {

        int a, b;
        Scanner swapObj = new Scanner(System.in);
        System.out.println("Enter a value:");
        a = swapObj.nextInt();
        System.out.println("Enter b value:");
        b = swapObj.nextInt();
        System.out.println("Before swapping a: " + a + ", b:" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a:" + a + ", b:" + b);

        swapObj.close();
    }

}

import java.util.Scanner;

public class IOScanner {
    public static void main(String[] args) {
        Scanner veeru = new Scanner(System.in);
        System.out.println("My name is");
        String name = veeru.next();
        System.out.println("My number");
        int num1 = veeru.nextInt();
        System.out.println("My name is;"+ name + "My Number is;" +num1);
        veeru.close();

    }
}

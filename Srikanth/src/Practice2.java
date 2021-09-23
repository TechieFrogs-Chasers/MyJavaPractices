import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        Scanner character = new Scanner(System.in);

        System.out.println("Enter A value:");
        int a = character.nextInt();
        // int a = 5;

        System.out.println("Enter B value:");
        int b = character.nextInt();
        // int b = 4;

        char c = (char) (a + b);

        System.out.println("c:" + c);
        character.close();
    }
}

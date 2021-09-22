import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        char character;
        Scanner Object = new Scanner(System.in);

        do {
            System.out.println("Enter a character:");
            while (Object.hasNextInt()) {
                String x = Object.next();
                System.out.println(x + " is not valid char");
            }
            character = Object.next().charAt(0);
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                System.out.println(character + " is an alphabet");
            } else {
                System.out.println(character + " is not an alphabet.");
            }
        } while (character <= 0);
        Object.close();

    }
}

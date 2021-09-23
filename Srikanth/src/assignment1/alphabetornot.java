import java.util.Scanner;

public class alphabetornot {

    public static void main(String[] args) {
        char character;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a character: ");
        character = a.next().charAt(0);
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println(character + " is an alphabet.");
        } else {
            System.out.println(character + " is not alphabet.");
        }
        a.close();
    }
}

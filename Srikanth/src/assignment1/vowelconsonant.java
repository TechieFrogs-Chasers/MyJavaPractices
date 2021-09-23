import java.util.Scanner;

public class vowelconsonant {
    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        System.out.println("Enter the character to check: ");
        char vow = vc.next().charAt(0);
        if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u' || vow == 'A' || vow == 'E' || vow == 'I'
                || vow == 'O' || vow == 'U') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is consonant");
        }
        vc.close();

    }
}

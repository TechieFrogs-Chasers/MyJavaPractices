package assignment1;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        Scanner vc = new Scanner(System.in);
        System.out.println("Enter the character to check: ");
        char vowel;
        do {
            System.out.println("enter any alphabet");
            while (vc.hasNextInt()) {
                String s = vc.next();
                System.out.println(s + "is not a valid character");
            }
            vowel = vc.next().charAt(0);

        } while (vowel <= 0);

        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == 'A' || vowel == 'E'
                || vowel == 'I' || vowel == 'O' || vowel == 'U') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is consonant");
        }
        vc.close();

    }
}

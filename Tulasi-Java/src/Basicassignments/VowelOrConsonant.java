package Basicassignments;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {//main method
        Scanner myscannerobj = new Scanner(System.in);//Scanner

        char letter;
        System.out.println("Enter a Alphabet: ");
        do {//Validation

            while (myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("Its not a valid character!");
            }
            letter = myscannerobj.next().charAt(0);
        }
        while ((letter < 65) | (letter > 90));

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " - " + "Its a lowercase vowel.");
            while ((letter < 97) | (letter > 122)) ;
        } else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " - " + "Its a uppercase vowel.");
        } else
            System.out.println(letter + " - " + "Its a consonants.");
        myscannerobj.close();//Scanner Close

    }
}


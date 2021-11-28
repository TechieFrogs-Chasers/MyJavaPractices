package Basicassignments;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner

        char letter;
        System.out.println("Enter a Alphabet: ");
        do {//Validation

            while (myScannerObj.hasNextInt()) {//for not to allow characters
                String input = myScannerObj.next();
                System.out.println("Its not a valid character!");
            }
            letter = myScannerObj.next().charAt(0);
        }
        while(!((letter <= 65) && (letter >= 90)||(letter >= 97) && (letter <= 122)));//ASCII values for alphabets
        //while(!((letter <= 'A') && (letter >= 'Z')||(letter >= 'a') && (letter <= 'z')));
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " - " + "Its a Lowercase Vowel.");

        } else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " - " + "Its a Uppercase Vowel.");
        } else
            System.out.println(letter + " - " + "Its a Consonants.");
        myScannerObj.close();//Scanner Close

    }
}


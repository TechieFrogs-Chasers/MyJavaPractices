package Basicassignments;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {//main method
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        int i = 0;
        char letter;
        System.out.println("Enter a Alphabet: ");

        do {//Validation
            while (!myscannerobj.hasNext()) {
                int input = myscannerobj.nextInt();
            }
            letter = myscannerobj.next().charAt(0);
        } while (letter <= 0);

        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                i++;
        }
        if (i == 1)
            System.out.println("Its a vowel.");
        else
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
        System.out.println("It's an Consonant. ");
           else
        System.out.println("It's not an Alphabet. ");
        myscannerobj.close();//Scanner Close

    }
}


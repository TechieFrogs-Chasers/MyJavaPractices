package Basicassignments;

import java.util.Scanner;

public class DisplayAlphabet {
    public static void main(String[] args) {//main method

        System.out.println("Alphabets both uppercase and lowercase: ");
        char letters;
        for (letters = 'a'; letters <= 'z'; letters++) {
            System.out.print(letters + " ");
        }
        System.out.println(" ");
        for (letters = 'A'; letters <= 'Z'; letters++) {
            System.out.print(letters + " ");

        }
    }
}
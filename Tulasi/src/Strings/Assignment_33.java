package Strings;

import java.util.Scanner;

public class Assignment_33 {
    public static void main(String[] args) {
        boolean result = true;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scannerObj.nextLine();
        scannerObj.close();
        word = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                result = false;
                break;
            }
        }
        if (result)
            System.out.println("Given word is a palindrome");
        else
            System.out.println("Given word is not a palindrome");
    }
}

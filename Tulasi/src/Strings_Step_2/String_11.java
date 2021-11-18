package Strings_Step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11.WAP to check given string is palindrome or not?
public class String_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferObj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string : ");
        String stringName = bufferObj.readLine();
        String rev = "";

        for (int i = stringName.length() - 1; i >= 0; i--)
            rev = rev + stringName.charAt(i);
        if (stringName.equals(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not a palindrome");
    }
}
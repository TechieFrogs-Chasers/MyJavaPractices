package Strings_Step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//10.WAP to remove vowels from the given string?
public class RemoveVolString_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferObj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        String stringName = bufferObj.readLine();
        int vowels_count = 0;
        for (int i = 0; i < stringName.length(); i++) {
            if ((stringName.charAt(i) == 'a' || stringName.charAt(i) == 'e' || stringName.charAt(i) == 'i' || stringName.charAt(i) == 'o' || stringName.charAt(i) == 'u') && (stringName.charAt(i) == 'A' || stringName.charAt(i) == 'E' || stringName.charAt(i) == 'I' || stringName.charAt(i) == 'O' || stringName.charAt(i) == 'U')) {
                vowels_count++;
            }
        }
    }}
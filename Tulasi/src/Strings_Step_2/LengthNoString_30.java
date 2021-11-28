package Strings_Step_2;

import java.util.Scanner;

//Find length of the string without using predefined  method?
public class LengthNoString_30 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter String: ");
        String stringName = scannerObj.next();
        int count = 0;
        for (int i = 0; i < stringName.length(); i++)
            count++;
        System.out.println(count);
    }
}
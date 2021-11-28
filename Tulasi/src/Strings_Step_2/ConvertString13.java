package Strings_Step_2;

import java.util.Scanner;
//13.WAP to convert given string into character array?
 class ConvertStrings_13 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String stringName = scannerObj.next();
        char[] array = stringName.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
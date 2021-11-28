package Strings_Step_2;

import java.util.Scanner;

//WAP to print next to last word of a given sentence?
public class LastString_25 {
    public static void main(String[] args) {
        String stringName = "";

        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Enter a sentence : ");

        stringName= scannerObj.nextLine();

        System.out.println("Last word of the sentence is : " + stringName.substring (stringName.lastIndexOf (" "), stringName.length()));
    }
}

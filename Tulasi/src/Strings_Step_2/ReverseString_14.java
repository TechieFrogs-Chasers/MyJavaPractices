package Strings_Step_2;

import java.util.Scanner;

//14.WAP to reverse a String?
public class ReverseString_14 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter original string :");
        String stringName =scannerObj.next();
        char ch;String rev="";

        for(int i=0;i<stringName.length();i++) {
            ch = stringName.charAt(i);
            rev = ch + rev;
        }
            System.out.println("After reverse: "+rev);
    }
}

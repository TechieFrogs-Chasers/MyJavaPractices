package Strings_Step_2;

import java.util.Scanner;

//15.	WAP to reverse a String without using charAt ( )?
public class RevWithoutString_15 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringName=scannerObj.next();
        String rev="";

        for(int i=0;i<stringName.length();i++){
            rev=rev+stringName.substring(stringName.length()-1-i, stringName.length()-i);
        }
        System.out.println(rev);
    }
}

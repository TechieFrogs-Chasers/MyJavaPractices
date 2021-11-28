package Strings;

import java.util.Scanner;

public class Assignment_36 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str=scannerObj.nextLine();
        scannerObj.close();
        String rev=" ";
        for(int i = str.length()-1; i >= 0; i--){
            rev=rev+str.charAt(i);

        }
        System.out.println("Orginal sentence: " + str);
        System.out.println("After sentence reversed :" + rev);
    }
}

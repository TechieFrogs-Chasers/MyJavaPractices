package Strings;//Package

import java.util.Scanner;//Scanner

public class Assignment_8 {//Driver class
    public static void main(String[] args) {//main method
        boolean isNumeric=true;
        Scanner scannerObj=new Scanner(System.in);//Scanner
        System.out.println("Give from keyboard : ");
        String str=scannerObj.next();
        scannerObj.close();//Scanner closed

        for (int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                isNumeric=false;
            }
        }
        System.out.println(isNumeric);
    }
}

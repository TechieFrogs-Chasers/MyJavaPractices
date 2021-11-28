package Strings_Step_2;

import java.util.Arrays;
import java.util.Scanner;

//12.WAP to check whether givens strings are anagram or not?
public class String_12 {
    public static void main(String[] args) {
        Scanner  scannerObj=new Scanner(System.in);
        System.out.println("Enter first string in anagram: ");
        String stringName=scannerObj.next();
        System.out.println("Enter second string in anagram: ");
        String stringNames=scannerObj.next();
        //   boolean result=false;
        if(stringName.length()==stringNames.length()){
            //     result=true;
            char[] charArray=stringName.toCharArray();
            char[] charArrays=stringNames.toCharArray();
            Arrays.sort(charArray);
            Arrays.sort(charArrays);
            boolean result=Arrays.equals(charArray,charArrays);
            if(result){
                System.out.println(stringName+" and "+stringNames+" are anagram !");
            }else {
                System.out.println(stringName+"  and "+stringNames+ "  are not anagram!");
            }
        }
        scannerObj.close();
    }
}

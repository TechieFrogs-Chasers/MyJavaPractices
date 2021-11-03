package Strings;//Package

import java.util.Scanner;

public class Assignment_18 {//Driver class

    public static void main(String[] args) {//main method
        Scanner scannerObj = new Scanner(System.in);
        String name = validate(scannerObj);
        scannerObj.close();
        System.out.println(name);
        char str[] = name.toCharArray();
        for(char s:str){
            System.out.println(s+" ");
        }
    }
    static String validate(Scanner scannerObj){ //validate method definition
        String nam;
        do{
            System.out.println("Enter a sentence");
            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            nam = scannerObj.nextLine();
        }while(nam.equals(""));
        return nam;
    }
}

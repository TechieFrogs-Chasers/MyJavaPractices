package JavaPrograms;

import java.util.Scanner;

public class ScannerPrac {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scObj.next();
        System.out.println("Name :"+name);
        System.out.println("Enter any id");
        int id = validation(scObj);
        System.out.println("Enter any name");
        char ch = scObj.next().charAt(1);
        System.out.println(ch);
        Scanner scObj1 = new Scanner("Hi Everyone, Hello");
        String st = scObj1.findInLine("Everyone");
        System.out.println(st);
        System.out.println("enter any number");
        System.out.println(scObj.hasNextInt());
        scObj.close();
        
    }
    static int validation(Scanner scObj){
        int num;
        do{
            System.out.println("Enter any number");
            while(!scObj.hasNextInt()){
            String st = scObj.next();
            System.out.println("Enter a vaild Integer");

        }
        num = scObj.nextInt();


    }while(num<=0);
    return num;
    
}
}

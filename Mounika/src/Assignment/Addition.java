package Assignment;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter 1st Value");
        byte i = scObj.nextByte();
        System.out.println("Enter 2nd Value");
        byte j = scObj.nextByte();
        System.out.println("Sum:"+(i+j));
        scObj.close();
        
    }
}

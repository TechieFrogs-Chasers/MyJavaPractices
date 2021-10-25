import java.util.Scanner;

import Strings.String;

public class Multiple{
public static void main(String[] args) {
    int num;
    int i =1;
    Scanner scObj = new Scanner(System.in);
    do{
        System.out.println("Give any number");
        while(!scObj.hasNextInt()){
            String str = scObj.next();
            System.out.println("Given number is not a vaild number.");
            System.out.println("Please enter any number");
        }
        num =scObj.nextInt();
        for(i=1;i<=num;i++){
            //System.out.println("Multipication table for given num:");
            System.out.println(num +" * " + i +" = "+ num*i);
        }
    }while(num<=0);
    scObj.close();
} 
    
}

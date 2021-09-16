package Assignment;

import java.util.Scanner;

public class Evenorodd {
    public  static void main(String... args){

        Scanner object=new Scanner(System.in); // create an scanner object 
        int num;
        do{
            System.out.println(" enter the number :");
            while (!object.hasNextInt()) //here we checks the given value is number or not
            {
                System.out.println(" this is not a number ; please enter the number ");
                object.next();  
            } 
            num=object.nextInt();
        }while (num<=0);

            if (num%2==0){ // here it checks for the given value is divisible by 2 
                System.out.println("given number is even "); // value divisible by 2 prints even 
            }else 
            System.out.println("given number is odd"); //value not divisible by 2 prints odd
        object.close();

    }
}
